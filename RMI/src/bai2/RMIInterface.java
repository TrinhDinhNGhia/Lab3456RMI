/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bai2;
import java.awt.print.Book;
import java.rmi.RemoteException;
import java.rmi.Remote;
import java.util.ArrayList;

/**
 *
 * @author Nghia
 */
public interface RMIInterface extends Remote {
 Book findBook(Book b) throws RemoteException;
 ArrayList<Book> allBooks() throws RemoteException;
}

