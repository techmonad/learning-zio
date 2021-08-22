import sbt._

object Dependencies {

  object V {

    lazy val zio = "1.0.11"

  }

  lazy val zio = "dev.zio" %% "zio" % V.zio
  lazy val zioStreams = "dev.zio" %% "zio-streams" % V.zio

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.8"

}
