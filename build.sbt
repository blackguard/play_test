name := "play_test"

version := "0.1"

scalaVersion := "2.10.1"

seq(webSettings :_*)

// you can also add multiple repositories at the same time
resolvers ++= Seq(
  "Scala Tools Releases" at "http://scala-tools.org/repo-releases/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
)

// when using the sbt web app plugin 0.2.4+, use "container" instead of "jetty" for the context.
// customize any further dependencies as desired.
libraryDependencies ++= Seq(
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
  "org.eclipse.jetty" % "jetty-webapp" % "9.0.3.v20130506" % "container",
  "com.h2database" % "h2" % "1.2.138"  // in-process database, useful for development systems
)

// by default, it listens on port 8080; use the following to override
port in container.Configuration := 8081

scalacOptions ++= Seq( "-unchecked", "-deprecation" )
