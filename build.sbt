
name := "akka-persistence-jdbc"

organization := "com.evolutiongaming"

organizationName := "Evolution Gaming"

organizationHomepage := Some(url("http://evolutiongaming.com"))

bintrayOrganization := Some("evolutiongaming")

scalaVersion := "2.12.4"

libraryDependencies ++= {
  val akkaVersion = "2.5.9"
  Seq(
    "com.typesafe.akka"   %% "akka-actor"                        % akkaVersion,
    "com.typesafe.akka"   %% "akka-persistence"                  % akkaVersion,
    "org.scalikejdbc"     %% "scalikejdbc"                       % "2.5.2",
    "commons-codec"        % "commons-codec"                     % "1.10",
    "ch.qos.logback"       % "logback-classic"                   % "1.1.3"           % Test,
    "com.typesafe.akka"   %% "akka-slf4j"                        % akkaVersion       % Test,
    "org.postgresql"       % "postgresql"                        % "9.4-1202-jdbc42" % Test,
    "com.h2database"       % "h2"                                % "1.4.188"         % Test,
    "mysql"                % "mysql-connector-java"              % "5.1.36"          % Test,
    "com.typesafe.akka"   %% "akka-testkit"                      % akkaVersion       % Test,
    "org.scalatest"       %% "scalatest"                         % "3.0.5"           % Test,
    "com.typesafe.akka"   %% "akka-persistence-tck"              % akkaVersion       % Test
  )
}

crossScalaVersions := Seq("2.12.4", "2.11.12")

autoCompilerPlugins := true

parallelExecution in Test := false

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

publishMavenStyle := true

licenses += ("Apache-2.0", url("http://opensource.org/licenses/apache2.0.php"))

releaseCrossBuild := true