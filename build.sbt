// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "citeapp"
organization := "edu.holycross.shot"
version := "0.1.0"

scalaVersion := "2.12.1"

persistLauncher in Compile := true

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")


resolvers += Resolver.jcenterRepo
libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.1",
    "com.lihaoyi" %%% "utest" % "0.4.5" % "test",

    "edu.holycross.shot.cite" %%% "xcite" % "1.1.0"
)
