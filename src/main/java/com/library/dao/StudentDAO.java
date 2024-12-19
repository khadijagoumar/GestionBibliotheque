package com.library.dao;

import com.library.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDAO {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Optional<Student> getStudentById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst();
    }
}
