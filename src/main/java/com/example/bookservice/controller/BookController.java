package com.example.bookservice.controller;

import com.example.bookservice.dto.BookResource;
import com.example.bookservice.service.BookResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
@RestController
@Api(tags = "Book", description = "Operations pertaining to Book Service")
public class BookController {

    private BookResourceService bookResourceService;

    @ApiOperation(hidden = true, value = "Retrieve a book by id", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/books/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookResource> getBookById(@PathVariable Long bookId) {
        return new ResponseEntity<>(bookResourceService.getBookById(bookId), HttpStatus.OK);
    }


    @Autowired
    public void setBookResourceService(BookResourceService bookResourceService) {
        this.bookResourceService = bookResourceService;
    }
}
