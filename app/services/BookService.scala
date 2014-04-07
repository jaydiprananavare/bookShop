package services

import models.BookInstance
import scala.slick.session.{Session, Database}
import scala.slick.driver.MySQLDriver.simple._

class BookService {
  Database.forURL(user = "root",password = "root" ,url= "jdbc:mysql://localhost:3306/test", driver = "com.mysql.jdbc.Driver") withSession {
    implicit session :Session =>

    def getBookById(id:String) = {
    BookInstance.findBy(id).first
  }
  }

}
