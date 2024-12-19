package com.library.dao;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDAO {
    private final List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Optional<Book> getBookById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst();
    }
}
