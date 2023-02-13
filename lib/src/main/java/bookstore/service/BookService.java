package bookstore.service;

import java.util.*;

import bookstore.model.Book;
import bookstore.model.BookBuilder;
import bookstore.model.User;
import bookstore.model.UserBuilder;

public class BookService {

	public List<Book> getBooks() {
		//Connect to db and fetch data and send it back
		List<Book> books = new ArrayList<Book>();
		UserBuilder userBuilder = new UserBuilder().setUserName("Author1").setPassword("xxx").setPseudonym("PseudoAuthor1");
		User user = userBuilder.getUser();
		BookBuilder bookBuilder= new BookBuilder().setUser(user).setDescription("Author 1 book").setCoverImage(null).setPrice(120.00).setTitle("Book1");
		Book book = bookBuilder.getBook();
		books.add(book);
		return books;
	}

}
