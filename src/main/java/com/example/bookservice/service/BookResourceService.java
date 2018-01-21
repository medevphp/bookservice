package com.example.bookservice.service;

import com.example.bookservice.converter.BookToResourceConverter;
import com.example.bookservice.dto.BookResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookResourceService {

    private BookService bookService;

    private BookToResourceConverter bookToResourceConverter;

    public BookResource getBookById(Long bookId) {
        return bookToResourceConverter.convert(bookService.getBookById(bookId));
    }

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Autowired
    public void setBookToResourceConverter(BookToResourceConverter bookToResourceConverter) {
        this.bookToResourceConverter = bookToResourceConverter;
    }
}
