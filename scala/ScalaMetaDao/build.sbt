//import com.github.retronym.SbtOneJar._

scalaVersion := "2.12.2"
//oneJarSettings

libraryDependencies += "commons-lang" % "commons-lang" % "2.6"
libraryDependencies += "net.lulli" % "metadao" % "1.0.2"
libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.15.1"


resolvers += DefaultMavenRepository
resolvers += "code.lulli.net" at "https://code.lulli.net/maven"
