lazy val root = (project in file(".")).
  settings(
    name := "VectorsAndExtensions",
    version := "2021.0",
    scalaVersion := "3.0.0-RC1"
  )

libraryDependencies += "org.scalameta" %% "munit" % "0.7.22" % Test
testFrameworks += new TestFramework("munit.Framework")

libraryDependencies += ("org.typelevel"  %% "squants"  % "1.6.0").withDottyCompat(scalaVersion.value)