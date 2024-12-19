package com.library.test;

import com.library.dao.BookDAO;
import com.library.dao.StudentDAO;
import com.library.model.Book;
import com.library.model.Student;
import com.library.service.BorrowService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BorrowServiceTest {
    private BorrowService borrowService;
    private BookDAO bookDAO;
    private StudentDAO studentDAO;

    @BeforeEach
    void setUp() {
        bookDAO = new BookDAO();
        studentDAO = new StudentDAO();
        borrowService = new BorrowService(new com.library.dao.BorrowDAO());

        // Add students
        studentDAO.addStudent(new Student(1, "Alice"));
        studentDAO.addStudent(new Student(2, "Bob"));

        // Add books
        bookDAO.add(new Book(1, "Java Programming", "John Doe", true));
        bookDAO.add(new Book(2, "Advanced Java", "Jane Doe", true));
    }

    @Test
    void testDisplayBorrows() {
        assertDoesNotThrow(() -> borrowService.displayBorrows());
    }
}
