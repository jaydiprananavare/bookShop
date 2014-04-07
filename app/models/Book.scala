package models

import scala.slick.driver.MySQLDriver.simple._
import scala.slick.lifted.ColumnBase

case class Book(id: String, title: String, price: String, isbn: String, nbOfPages: String)

object BookInstance extends Table[Book]("book") {

  def id = column[String]("bookid", O.PrimaryKey, O AutoInc)

  def title = column[String]("title")

  def price = column[String]("price")

  def isbn = column[String]("isbn")

  def nbOfPages = column[String]("nbofpages")

  def * = id ~ title ~ price ~ isbn ~ nbOfPages <>(Book, Book.unapply _)

  def findBy(id :String) =
    for { book <- BookInstance
      if book.id === id
  } yield book
}