package com.techmonad.learning.zio

import java.io.IOException

import zio.console._
import zio.{App, ZIO}

object LearningZio extends App {

  def run(args: List[String]): ZIO[Console, Nothing, Int] = myAppLogic.fold(_ => 1, _ => 0)

  val myAppLogic: ZIO[Console, IOException, Unit] =
    for {
      _ <- putStrLn("Hello! What is your name?")
      name <- getStrLn
      _ <- putStrLn(s"Hello, $name, welcome to ZIO!")
    } yield ()

}

