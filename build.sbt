ThisBuild / version := "0.1.0-SNAPSHOT"
//
ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala-coding-challenges"
  )

libraryDependencies ++= Seq(
  "org.creativescala" %% "doodle" % "0.10.1",
  "org.scalameta" %% "munit" % "0.7.29" % Test,
  "org.scalatest" %% "scalatest" % "3.2.15" % "test"
)