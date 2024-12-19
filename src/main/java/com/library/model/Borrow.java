package com.library.model;

public class Borrow {
    private int id;
    private Student student;
    private Book book;

    public Borrow(int id, Student student, Book book) {
        this.id = id;
        this.student = student;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "id=" + id +
                ", student=" + student +
                ", book=" + book +
                '}';
    }
}
