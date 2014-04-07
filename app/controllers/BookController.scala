package controllers

import play.api.mvc._
import templating.JadeRenderer

class BookController( jadeRenderer : JadeRenderer) extends Controller {

  def index = Action{

    bookSer


    Ok(jadeRenderer.render(templateName ))
  }

  private val templateName = "main"
}
