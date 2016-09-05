import scala.collection.immutable.Nil
import scala.language.higherKinds

import scala.annotation.elidable
import scala.annotation.elidable.ASSERTION
import monocle.Getter

import scalaz.Leibniz.===
import scalaz._
import scalaz.stream.Process
import scala.concurrent.stm._
import scalaz.concurrent.Task
import scalaz.stream.Process


package object helper {
  implicit class RichProcess[F[_], A](p : Process[F, A]) {
    def withFilter(f: A => Boolean) = p.filter(f)
  }

  implicit class RichDisjunction[A, B](d : A \/ B) {
    def withFilter(f : B => Boolean)(implicit monoid: Monoid[A]) = d.filter(f)(monoid)
  }

  implicit class RichMap[K, V](m : Map[K, V]) {
    def mapValuesWithKeys[V2](f : (K, V) => V2): Map[K, V2] =
      m map { case (k, v) => (k, f(k, v)) }
  }

  implicit class MultiMap[K, V](m : Map[K, Set[V]]) {
    def adjust[B1 >: Set[V]](key: K)(f : B1 => B1) = m updated (key, f (m getOrElse(key, Set())))
  }

  implicit class TransitiveClosure[S](m: Map[S, Set[S]]) {
    def trans(): Map[S, Set[S]] = {
      def transget(s : S, seen : Set[S]) : Set[S] = {
        if (m.contains(s)) {
          val ms = m(s)
          ms ++ ms.flatMap[S,Set[S]](ss => if(!seen.contains(ss))
                                    transget(ss, seen ++ ms) else Set())
        }
        else Set()
      }
      m.keys.map(k => k -> transget(k, Set[S]())).toMap
    }
  }

  implicit class RichIterable[A](it : Iterable[A]) {
    def single: Option[A] = {
      val iter = it.iterator
      if (iter.hasNext) {
        val r = iter.next()
        if (iter.hasNext) {
          None
        } else Some(r)
      } else None
    }
  }

  implicit class RichSet[A](sa : Set[A]) {
    def sequenceU(implicit G: Unapply[Applicative, A]): G.M[Set[G.A]] = {
      sa.traverseU(identity)
    }

    def traverseU[GB](f : A => GB)(implicit G: Unapply[Applicative, GB]): G.M[Set[G.A]] = {
      sa.foldLeft(G.TC.pure(Set[G.A]()))((ss : G.M[Set[G.A]], el : A) =>
         G.TC.lift2[Set[G.A], G.A, Set[G.A]](_ + _)(ss, G.apply(f(el))))
    }
  }

  implicit class TMapExtensions[A,B](m : TMap[A,B]) {
    def updateValue(k : A, f : B => B) = atomic { implicit txn =>
      val oldVr = m.get(k)
      oldVr.foreach(oldV => m.update(k, f(oldV)))
    }
  }

  implicit class ListNormalizeOps[A](l : List[A]) {
    def normalizeMonoidal(implicit monoid: Monoid[A]): A = l match {
      case Nil => monoid.zero
      case x :: xs if x == monoid.zero => xs.normalizeMonoidal
      case x :: xs => xs match {
        case Nil => x
        case _ => monoid.append(x, xs.normalizeMonoidal)
      }
    }
  }

  implicit val pmn = scalaz.stream.Process.processMonadPlus[Nothing]
  implicit val pmt = scalaz.stream.Process.processMonadPlus[Task]

  case class Interleaved[+F[_],+O](toProcess: Process[F, O]) {
    def map[O2](f : O => O2) = Interleaved(toProcess.map(f))

    def flatMap[F2[x] >: F[x], O2](f: O => Interleaved[F2, O2])
    : Interleaved[F2, O2] = Interleaved {
      toProcess.fold(Process.halt : Process[F2, O2])((ps, o) =>
        ps.tee((f(o).toProcess))(helper.teePlus.interleaveAll)
      ).flatMap(identity)
    }
  }

  implicit class InterleavedProcess[F[_],O](p: Process[F,O]) {
    val interleaved: Interleaved[F, O] = Interleaved(p)
  }

  implicit def interleavedMonad[F[_]] = new Monad[Interleaved[F, ?]] {
    override def bind[A, B](fa: Interleaved[F, A])(f: (A) => Interleaved[F, B]): Interleaved[F, B] = fa.flatMap[F,B](f)

    override def point[A](a: => A): Interleaved[F, A] = Interleaved(Process(a))
  }
}


