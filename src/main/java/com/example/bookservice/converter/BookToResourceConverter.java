package com.example.bookservice.converter;

import com.example.bookservice.dto.BookResource;
import com.example.bookservice.entity.Book;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookToResourceConverter implements Converter<Book, BookResource>{

    @Override
    public BookResource convert(Book book) {
        return new BookResource(book);
    }
}
