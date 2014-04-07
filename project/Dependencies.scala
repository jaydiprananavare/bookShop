import play.Project._
import sbt._
object Dependencies {

  def dependencies() = {
    anorm
    Seq(

      "mysql" % "mysql-connector-java" % "5.1.24",
      "com.typesafe.slick" % "slick_2.10" % "1.0.0",
    //  "org.slf4j" % "slf4j-nop" % "1.6.4",
      //      "com.google.code.gson" % "gson" % "2.1",
      //      "com.google.guava" % "guava" % "12.0.1",
      "org.fusesource.scalate" % "scalate-core_2.10" % "1.6.1"
      //      "org.scalatest" % "scalatest_2.10" % "2.0.M5b" % "test"
    ) ++ testDependencies
  }

  private val testDependencies = Seq(
    //   "org.seleniumhq.selenium" % "selenium-java" % "2.32.0" % "test",
    //    "org.mockito" % "mockito-all" % "1.9.5",
    //    "com.marklogic" % "marklogic-xcc" % "6.0.3" from "http://developer.marklogic.com/maven2/com/marklogic/marklogic-xcc/6.0.3/marklogic-xcc-6.0.3.jar",
    //    "org.scala-tools.testing" % "specs_2.10" % "1.6.9"
  )
}