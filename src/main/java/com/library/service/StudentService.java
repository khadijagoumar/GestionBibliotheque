package com.library.service;

import com.library.dao.StudentDAO;
import com.library.model.Student;

import java.util.List;

public class StudentService {
    private final StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    public List<Student> displayStudents() {
        return studentDAO.getAllStudents();
    }

    public Student findStudentById(int id) {
        return studentDAO.getStudentById(id).orElse(null);
    }
}
