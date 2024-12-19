package com.library.test;

import com.library.dao.BookDAO;
import com.library.model.Book;
import com.library.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {
    private BookService bookService;

    @BeforeEach
    void setUp() {
        bookService = new BookService(new BookDAO());
    }

    @Test
    void testAddBook() {
        Book book = new Book(1, "Java Programming", "John Doe", true);
        assertDoesNotThrow(() -> bookService.addBook(book));
        assertEquals(1, bookService.displayBooks().size());
    }

    @Test
    void testDisplayBooks() {
        assertDoesNotThrow(() -> bookService.displayBooks());
    }
}
