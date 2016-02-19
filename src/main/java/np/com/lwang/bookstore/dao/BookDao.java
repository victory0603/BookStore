package np.com.lwang.bookstore.dao;


import java.util.List;

import np.com.lwang.bookstore.model.Book;

public interface BookDao {
	/*
	 * CREATE and UPDATE
	 */
	public void saveBook(Book book);
	
	/*
	 * READ
	 */
	public List<Book> listBooks();
	public Book getBook(Long id);
	
	/*
	 * DELETE
	 */
	public void deleteBook(Long id);
}
