package controllers

import play.api._
import play.api.mvc._
import templating.JadeRenderer
import services.BookService
import Pojo.Book

class BookController(bookService:BookService, jadeRenderer : JadeRenderer) extends Controller {

  def index = Action{

    bookService.insertBook(Book("123","scala",12.12,"asdfg",100))
    Ok(jadeRenderer.render(templateName ))
  }

  private val templateName = "main"
}
