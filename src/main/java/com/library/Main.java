package com.library;

import com.library.service.BookService;
import com.library.service.BorrowService;
import com.library.service.StudentService;
import com.library.model.Book;
import com.library.model.Student;
import com.library.dao.BookDAO;
import com.library.dao.StudentDAO;
import com.library.dao.BorrowDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookService bookService = new BookService(new BookDAO());
        StudentService studentService = new StudentService(new StudentDAO());
        BorrowService borrowService = new BorrowService(new BorrowDAO());

        boolean running = true;

        while (running) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher les livres");
            System.out.println("3. Ajouter un étudiant");
            System.out.println("4. Afficher les étudiants");
            System.out.println("5. Quitter");

            System.out.print("Choisir une option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Titre du livre: ");
                    String title = scanner.nextLine();
                    System.out.print("Auteur du livre: ");
                    String author = scanner.nextLine();
                    Book book = new Book(0, title, author, true);
                    bookService.addBook(book);
                    break;

                case 2:
                    bookService.displayBooks().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Nom de l'étudiant: ");
                    String studentName = scanner.nextLine();
                    Student student = new Student(0, studentName);
                    studentService.addStudent(student);
                    break;

                case 4:
                    studentService.displayStudents().forEach(System.out::println);
                    break;

                case 5:
                    running = false;
                    System.out.println("Au revoir!");
                    break;

                default:
                    System.out.println("Option invalide.");
            }
        }

        scanner.close();
    }
}
