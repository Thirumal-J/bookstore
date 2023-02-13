package bookstore.controllers;
import bookstore.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import bookstore.service.*;

@RestController
public class BookController {

    @GetMapping("/")
    public String testApi(){
        return "Hello world";
    }

    @GetMapping("/list/books")
    public List<Book> all(){
    	List<Book> books = new ArrayList<>();
    	System.out.println("Inside list books API");
    	BookService bookservice = new BookService();
    	books = bookservice.getBooks();
        return books;
    }
 
    public void badIdExceptionHandler(){}
}
