package com.library.service;

import com.library.dao.BookDAO;
import com.library.model.Book;

import java.util.List;

public class BookService {
    private final BookDAO bookDAO;

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public void addBook(Book book) {
        bookDAO.add(book);
    }

    public List<Book> displayBooks() {
        return bookDAO.getAllBooks();
    }

    public Book findBookById(int id) {
        return bookDAO.getBookById(id).orElse(null);
    }
}
