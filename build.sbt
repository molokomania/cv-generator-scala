name := """cv-generator-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "com.adrianhurt" %% "play-bootstrap3" % "0.4.5-P24",
  "org.webjars.bower" % "font-awesome" % "4.5.0",
  "de.joergviola" %% "play2pdf-scala" % "0.6.11"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
