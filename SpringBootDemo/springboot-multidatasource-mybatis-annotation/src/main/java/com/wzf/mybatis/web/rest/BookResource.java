package com.wzf.mybatis.web.rest;

import com.wzf.mybatis.entity.Book;
import com.wzf.mybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * BookResource
 *
 */
@RestController
@RequestMapping("/api")
public class BookResource {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<Book> getBook(@RequestParam String name) {
        Book book = bookService.selectPlayer(name);
        return ResponseEntity.ok(book);
    }

    @PostMapping("/books")
    public ResponseEntity<Void> insertBook(@RequestBody Book book){
        int i = bookService.insertPlayer(book);
        return ResponseEntity.ok().build();
    }
}
