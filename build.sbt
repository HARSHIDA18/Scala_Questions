ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "Scala Questions"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"