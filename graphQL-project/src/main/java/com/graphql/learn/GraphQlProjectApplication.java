package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQlProjectApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("bookServiceImpl") // Match the bean name of BookServiceImpl
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1=new Book();
		b1.setTitle("abc");
		b1.setAuthor("abc");
		b1.setPrice(500);
		b1.setPages(500);

		Book b2=new Book();
		b2.setTitle("def");
		b2.setAuthor("def");
		b2.setPrice(300);
		b2.setPages(300);

		Book b3=new Book();
		b3.setTitle("ghi");
		b3.setAuthor("ghi");
		b3.setPrice(400);
		b3.setPages(400);

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
}
