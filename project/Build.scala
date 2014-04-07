import sbt._
import Keys._
import play.Project._
import Dependencies._


object Build extends Build {

  val appName         = "bookShop"
  val appVersion      = "1.0-SNAPSHOT"


  val main = play.Project(appName, appVersion, dependencies()).settings(
    // Add your own project settings here

  )

}
