package np.com.lwang.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import np.com.lwang.bookstore.dao.BookDao;
import np.com.lwang.bookstore.model.Book;
import np.com.lwang.bookstore.service.BookService;


@Service
public class BookServiceImpl implements BookService {
	@Autowired
    public BookDao bookDao;
	
    public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Transactional
    public void saveBook(Book book) {
           bookDao.saveBook(book);
    }

    @Transactional(readOnly = true)
    public List<Book> listBooks() {
           return bookDao.listBooks();
    }

    @Transactional(readOnly = true)
    public Book getBook(Long id) {
           return bookDao.getBook(id);
    }

    @Transactional
    public void deleteBook(Long id) {
           bookDao.deleteBook(id);

    }
}
