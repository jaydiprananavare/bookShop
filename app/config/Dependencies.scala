package config

import templating.JadeRenderer
import services.BookService
import Dao.BookDao


class Dependencies {

  val jadeRenderer = new JadeRenderer
  val bookService = new BookService(new BookDao)
}
