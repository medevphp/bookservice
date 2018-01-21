package com.example.bookservice.dto;

import com.example.bookservice.controller.BookController;
import com.example.bookservice.entity.Book;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import java.io.Serializable;
import java.util.Date;

public class BookResource extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 3672858012371442277L;

    private Long bookId;

    private String title;

    private String isbn;

    private Integer year;

    private String author;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public BookResource(Book book) {
        Link selfLink = ControllerLinkBuilder.linkTo(BookController.class).slash(book.getId()).withSelfRel();
        this.add(selfLink);
        bookId = book.getId();
        title = book.getTitle();
        isbn = book.getIsbn();
        year = book.getYear();
        author = book.getAuthor();
        createdAt = book.getCreatedAt();
        updatedAt = book.getUpdatedAt();
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        return "BookResource{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                '}';
    }
}
