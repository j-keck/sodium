
val sodium = crossProject.crossType(CrossType.Pure).in(file(".")).
  settings(
    name := "sodium",
    version := "1.0",
    scalaVersion := "2.11.6",
    
    resolvers += Resolver.bintrayRepo("j-keck", "sodium"),
    licenses += ("BSD", url("https://raw.githubusercontent.com/SodiumFRP/sodium/master/COPYING"))
  ).
  jvmSettings(
    libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"
  )

lazy val sodiumJVM = sodium.jvm
lazy val sodiumJS = sodium.js

enablePlugins(ScalaJSPlugin)
