package controllers

import play.api._
import play.api.mvc._
import templating.JadeRenderer

object Application extends Controller {

  val renderer = new JadeRenderer

  def index = Action {
    Ok(renderer.render("index"))
  }
  
}