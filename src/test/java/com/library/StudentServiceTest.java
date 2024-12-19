package com.library.test;

import com.library.dao.StudentDAO;
import com.library.model.Student;
import com.library.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    private StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService(new StudentDAO());
    }

    @Test
    void testAddStudent() {
        Student student = new Student(1, "Alice");
        assertDoesNotThrow(() -> studentService.addStudent(student));
        assertEquals(1, studentService.displayStudents().size());
    }

    @Test
    void testDisplayStudents() {
        assertDoesNotThrow(() -> studentService.displayStudents());
    }
}
