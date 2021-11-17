/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Nghia
 */
public class Book implements Serializable {
   
    private static final long serialVersionUID = 1190476516911661470L;
 private String title;
 private String isbn;
 private double cost;

    public Book() {
    }

    public Book(String title, String isbn, double cost) {
        this.title = title;
        this.isbn = isbn;
        this.cost = cost;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

  

  

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", isbn=" + isbn + ", cost=" + cost + '}';
    }
 
    
}
