package com.example.servingwebcontent.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class BorrowSlip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String bookTitle;
    private int userid;

    private LocalDate borrowDate;
    private LocalDate dueDate;
    private boolean isReturned;

    public BorrowSlip() {}

    public BorrowSlip(String bookTitle, int userid, LocalDate borrowDate, LocalDate dueDate) {
        this.bookTitle = bookTitle;
        this.userid = userid;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.isReturned = false;
    }

    // Getter
    public String getBookTitle() {
        return bookTitle;
    }

    public int getUserid() {
        return userid;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    // Setter
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public void setBorrowSlip(String bookTitle, int userid, LocalDate borrowDate, LocalDate dueDate) {
        this.bookTitle = bookTitle;
        this.userid = userid;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }
}
