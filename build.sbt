name := "CollectionHub"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies += "com.lihaoyi" %% "ujson" % "0.6.6"

lazy val libhublab=RootProject(file("../LibHublab"))

val main=Project("CollectionHub",file(".")) dependsOn libhublab