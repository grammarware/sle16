import com.typesafe.sbt.license.{LicenseInfo, DepModuleInfo}
import sbt._

// Project Metadata

name := "SymexTRON"
description := "A tool for automatically generating tests for TRON programs using symbolic execution"
version := "0.5"
startYear := Some(2015)
licenses += "GPLv3" -> url("https://www.gnu.org/licenses/gpl-3.0.en.html")

organization := "dk.itu"
organizationName := "IT University of Copenhagen"
organizationHomepage := Some(url("https://itu.dk"))


// License things
licenseOverrides := {
  case DepModuleInfo("com.google.guava",_,_) => LicenseInfo.APACHE2
  case DepModuleInfo("org.slf4j",_,_) => LicenseInfo.MIT
}

// Configuration

resolvers += Resolver.sonatypeRepo("public")
resolvers += Resolver.sonatypeRepo("releases")
resolvers += "softprops-maven" at "http://dl.bintray.com/content/softprops/maven"


mainClass in Compile := Some("examples.evaluation.Evaluation")

version := "0.3"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies += "org.sat4j" % "org.sat4j.core" % "2.3.1"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.3"

libraryDependencies += "org.scalaz.stream" %% "scalaz-stream" % "0.8"

libraryDependencies += "org.scala-stm" %% "scala-stm" % "0.7"

val monocleLibraryVersion = "1.2.0-M1"

libraryDependencies ++= Seq(
  "com.github.julien-truffaut"  %%  "monocle-core"    % monocleLibraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-generic" % monocleLibraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-macro"   % monocleLibraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-state"   % monocleLibraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-law"     % monocleLibraryVersion % "test"
)

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

libraryDependencies += "me.lessis" %% "lapse" % "0.1.0"

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.7.1")

triggeredMessage := Watched.clearWhenTriggered

maxErrors := 10