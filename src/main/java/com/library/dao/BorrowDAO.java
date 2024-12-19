package com.library.dao;

import com.library.model.Borrow;

import java.util.ArrayList;
import java.util.List;

public class BorrowDAO {
    private final List<Borrow> borrows = new ArrayList<>();

    public List<Borrow> getAllBorrows() {
        return borrows;
    }

    public void addBorrow(Borrow borrow) {
        borrows.add(borrow);
    }
}
