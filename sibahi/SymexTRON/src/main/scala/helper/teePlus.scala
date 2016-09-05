package helper

import scalaz.stream

object teePlus {
  def interleaveAll[I]: stream.Tee[I, I, I] = {
    stream.tee.receiveLOr[I, I, I](stream.tee.passR[I]){ i =>
      stream.tee.receiveROr[I, I, I](stream.Process.emit(i) ++ stream.tee.passL[I]) { i2 =>
        stream.Process.emit(i) ++ stream.Process.emit(i2) ++ interleaveAll
      }
    }
  }
}
