package com.example.bookservice;

import com.example.bookservice.entity.Book;
import com.example.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class BookserviceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BookserviceApplication.class, args);
    }

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) {

        List<Book> books = bookRepository.findAll();

        if (books.isEmpty()) {
            Book book1 = new Book();
            book1.setAuthor("Borat Sagdiyev");
            book1.setIsbn(UUID.randomUUID().toString());
            book1.setTitle("The Great Learnings Of America");
            book1.setYear(2018);

            Book book2 = new Book();
            book2.setAuthor("Michael Jordan");
            book2.setIsbn(UUID.randomUUID().toString());
            book2.setTitle("How To Win 6 NBA Title");
            book2.setYear(2016);

            Book book3 = new Book();
            book3.setAuthor("Lebron James");
            book3.setIsbn(UUID.randomUUID().toString());
            book3.setTitle("Making It Happen!");
            book3.setYear(2015);

            bookRepository.save(new ArrayList<>(Arrays.asList(book1, book2, book3)));
        }
    }
}
