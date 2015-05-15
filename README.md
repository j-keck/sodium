**clone of https://github.com/SodiumFRP/sodium for binary scala packages**

i publish the binary packages for scala-2.11 and scala-js-0.6.2 under https://bintray.com/j-keck/maven/sodium/view


## SBT usage

add the bintray repo: 

    resolvers += Resolver.bintrayRepo("j-keck", "maven")


packages for scala (on the jvm):

    libraryDependencies += "sodium" %% "sodium" % "1.0"


packages for scala-js (note the three %%%):

    libraryDependencies += "sodium" %%% "sodium" % "1.0"



