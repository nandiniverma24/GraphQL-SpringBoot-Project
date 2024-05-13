package com.graphql.learn.controllers;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    @MutationMapping("createBook")
    public Book create(@Argument BookInput book) {
        Book b1=new Book();
        b1.setAuthor(book.getAuthor());
        b1.setPrice(book.getPrice());
        b1.setPages(book.getPages());
        b1.setTitle(book.getTitle());
        b1.setDesc(book.getDesc());
        return this.bookService.create(b1);
    }

    @QueryMapping("allBooks")
    public List<Book> getAll() {
        return this.bookService.getAll();
    }

    @QueryMapping("getBook")
    public Book getBook(@Argument int bookId) {
        return this.bookService.get(bookId);
    }
}

@Getter
@Setter
class BookInput
{
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
