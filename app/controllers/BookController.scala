package controllers

import play.api._
import play.api.mvc._
import templating.JadeRenderer

class BookController(jadeRenderer : JadeRenderer) extends Controller {

  def index = Action{

    Ok(jadeRenderer.render(templateName ))
  }

  private val templateName = "main"
}
