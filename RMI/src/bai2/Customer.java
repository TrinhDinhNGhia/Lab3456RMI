/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;

/**
 *
 * @author Nghia
 */
public class Customer {
           private static RMIInterface rmi;
            public static void main(String[] args) throws MalformedURLException,RemoteException, NotBoundException{
              Registry reg = LocateRegistry.getRegistry("localhost", 1122);
              // Lấy đối tượng từ xa
            RMIInterface rmi = (RMIInterface) reg.lookup("abc");
                // Gọi phương thức từ xa
              boolean findmore;
            do {
                       String[] options = {"Show All", "Find a book", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose anaction", "Option dialog",JOptionPane.DEFAULT_OPTION,
                   JOptionPane.INFORMATION_MESSAGE,null, options, options[0]);
                switch (choice) {
           case 0 -> {
          ArrayList<java.awt.print.Book> list = rmi.allBooks();
                StringBuilder message = new StringBuilder();
                 list.forEach(x -> {message.append(x.toString()).append("\n");
                            });
                   JOptionPane.showMessageDialog(null, new String(message));
                 }

           case 1 -> {
          String isbn = JOptionPane.showInputDialog("Type the isbn of the book you want to find.");
            try {
                    Book response = rmi.findBook(new Book(isbn));
                   JOptionPane.showMessageDialog(null, "Title: " +response.getTitle() +"\n" + "Cost: $" +response.getCost(),response.getIsbn(),
                   JOptionPane.INFORMATION_MESSAGE);
                 } catch (NoSuchElementException ex) {
                  JOptionPane.showMessageDialog(null, "Not found");
                 }
                  }  default -> System.exit(0);
                 }
             findmore = (JOptionPane.showConfirmDialog(null, "Do you want toexit?","Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION);
           } while (findmore);
 }
}
   
