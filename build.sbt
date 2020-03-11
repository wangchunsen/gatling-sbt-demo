name := "gatling-demo"

version := "0.1"

scalaVersion := "2.12.10"

enablePlugins(GatlingPlugin)

libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.3.1" % "test",
  "io.gatling" % "gatling-test-framework" % "3.3.1" % "test"
)

libraryDependencies ++= Seq(
  "com.softwaremill.sttp.client" %% "core" % "2.0.4",
  "com.softwaremill.sttp.client" %% "spray-json" % "2.0.4"
)