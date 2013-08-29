package services

import Dao.BookDao
import Pojo.Book

class BookService(bookDao : BookDao) {
   //service layer for business logic
  def insertBook(book:Book)={

    bookDao.insertBook(book)
  }

}
