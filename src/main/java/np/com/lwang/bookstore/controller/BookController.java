package np.com.lwang.bookstore.controller;

import java.util.Map;

import np.com.lwang.bookstore.model.Book;
import np.com.lwang.bookstore.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
    public BookService bookService;

    @RequestMapping(value = { "/", "/listBooks.do" })
    public String listBooks(Map<String, Object> map) {

           map.put("book", new Book());

           map.put("bookList", bookService.listBooks());

           return "/book/listBooks";
    }

    public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/get/{bookId}.do")
    public String getBook(@PathVariable Long bookId, Map<String, Object> map) {

           Book book = bookService.getBook(bookId);

           map.put("book", book);

           return "/book/bookForm";
    }

    @RequestMapping(value = "/save.do", method = RequestMethod.POST)
    public String saveBook(@ModelAttribute("book") Book book,
                  BindingResult result) {

           bookService.saveBook(book);

           /*
            * Note that there is no slash "/" right after "redirect:"
            * So, it redirects to the path relative to the current path
            */
           return "redirect:listBooks.do";
    }

    @RequestMapping("/delete/{bookId}.do")
    public String deleteBook(@PathVariable("bookId") Long id) {

           bookService.deleteBook(id);

           /*
            * redirects to the path relative to the current path
            */
           // return "redirect:../listBooks";

           /*
            * Note that there is the slash "/" right after "redirect:"
            * So, it redirects to the path relative to the project root path
            */
           return "redirect:/book/listBooks.do";
    }
}
