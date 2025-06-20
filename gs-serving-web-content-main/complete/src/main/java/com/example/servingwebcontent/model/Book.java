package com.example.servingwebcontent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String title;
    private String author;
    private String publisher;
    private int numPages;
    private int quantity;

    public Book() {}

    public Book(String title, String author, String publisher, int numPages, int quantity){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.numPages = numPages;
        this.quantity = quantity;
    }

    // Getter
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public int getNumPages(){
        return numPages;
    }

    public int getQuantity(){
        return quantity;
    }

    // Setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public void setNumPages(int numPages){
        this.numPages = numPages;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setBook(String title, String author, String publisher, int numPages, int quantity){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.numPages = numPages;
        this.quantity = quantity;
    }
}
