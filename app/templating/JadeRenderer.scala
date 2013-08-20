package templating

import play.api._
import org.fusesource.scalate.layout.DefaultLayoutStrategy
import org.fusesource.scalate.TemplateEngine
import org.fusesource.scalate.util.FileResourceLoader
import play.api.templates.Html
import play.api.Play.current

class JadeRenderer {

  private val scalateEngine = {
    val engine = new TemplateEngine
    engine.resourceLoader = new FileResourceLoader(Some(Play.getFile("app/views")))
    engine.layoutStrategy = new DefaultLayoutStrategy(engine, "app/views/layouts/default.jade")
    engine.classpath = "tmp/classes"
    engine.workingDirectory = Play.getFile("tmp")
    engine.combinedClassPath = true
    engine.escapeMarkup = true
    engine.classLoader = Play.classloader
    engine
  }

  def render(templateName: String, args: (String, Any)*): Html = {
    Html(scalateEngine.layout(templateFile(templateName), args.toMap))
  }

  private def templateFile(name: String): String = {
    s"$name.jade"
  }

  def shutDown() = {
   scalateEngine.shutdown()
  }
}
