import sbt._
import Keys._

object build extends Build {

  val deps: Seq[Setting[_]] = Seq(
    libraryDependencies ++= Seq(
      "javax.persistence" % "persistence-api" % "1.0" % "compile",
      "javax.validation" % "validation-api" % "1.0.0.GA" % "compile",
      "junit" % "junit" % "4.11" % "test",
      "com.novocode" % "junit-interface" % "0.9" % "test"
    )
  )

  val leaf = project.in(file("leaf")).settings(deps: _*)

  val module1 = project.in(file("module1")).dependsOn(leaf).settings(deps: _*)
  val module2 = project.in(file("module2")).dependsOn(leaf).settings(deps: _*)
  val module3 = project.in(file("module3")).dependsOn(leaf).settings(deps: _*)
  val module4 = project.in(file("module4")).dependsOn(leaf).settings(deps: _*)
  val module5 = project.in(file("module5")).dependsOn(leaf).settings(deps: _*)
  val module6 = project.in(file("module6")).dependsOn(leaf).settings(deps: _*)
  val module7 = project.in(file("module7")).dependsOn(leaf).settings(deps: _*)
  val module8 = project.in(file("module8")).dependsOn(leaf).settings(deps: _*)
  val module9 = project.in(file("module9")).dependsOn(leaf).settings(deps: _*)
  val module10 = project.in(file("module10")).dependsOn(leaf).settings(deps: _*)
  val module11 = project.in(file("module11")).dependsOn(leaf).settings(deps: _*)
  val module12 = project.in(file("module12")).dependsOn(leaf).settings(deps: _*)
  val module13 = project.in(file("module13")).dependsOn(leaf).settings(deps: _*)
  val module14 = project.in(file("module14")).dependsOn(leaf).settings(deps: _*)
  val module15 = project.in(file("module15")).dependsOn(leaf).settings(deps: _*)

  val root = project.in(file("aggregator")).dependsOn(
    module1,
    module2,
    module3,
    module4,
    module5,
    module6,
    module7,
    module8,
    module9,
    module10,
    module11,
    module12,
    module13,
    module14,
    module15
  ).settings(mainClass := Some("com.my.aggregator.Main")).settings(deps: _*)
}
