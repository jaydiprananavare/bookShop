package controllers

import config.Dependencies

object Controllers {
  val dependencies = new Dependencies
 }

  import Controllers.dependencies._

object BookControllerInstance extends BookController(bookService,jadeRenderer)
