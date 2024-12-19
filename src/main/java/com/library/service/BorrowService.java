package com.library.service;

import com.library.dao.BorrowDAO;
import com.library.model.Borrow;

import java.util.List;

public class BorrowService {
    private final BorrowDAO borrowDAO;

    public BorrowService(BorrowDAO borrowDAO) {
        this.borrowDAO = borrowDAO;
    }

    public void displayBorrows() {
        List<Borrow> borrows = borrowDAO.getAllBorrows();
        borrows.forEach(System.out::println);
    }
}
