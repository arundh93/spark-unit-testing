name := "spark-unit-testing"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.1",
  "org.apache.spark" %% "spark-catalyst" % "2.3.1",
  "org.apache.spark" %% "spark-catalyst" % "2.3.1" % "test" classifier "tests",
  "org.apache.spark" %% "spark-core" % "2.3.1" % "test" classifier "tests",
  "org.apache.spark" %% "spark-sql" % "2.3.1",
  "org.apache.spark" %% "spark-sql" % "2.3.1" % "test" classifier "tests",

  "org.scalatest" %% "scalatest" % "3.0.1"
)