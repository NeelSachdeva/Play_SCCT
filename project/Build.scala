import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName = "Play_SCCT"
  val appVersion = "1.0-SNAPSHOT"
  lazy val scct_settings = Defaults.defaultSettings ++ Seq(ScctPlugin.instrumentSettings: _*)
  val appDependencies = Seq(
    "org.scalatest" %% "scalatest" % "1.9.1" % "test" // Add your project dependencies here,
    )

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA,settings = scct_settings).settings( // Add your own project settings here      
  testOptions in Test := Nil
  )

}
