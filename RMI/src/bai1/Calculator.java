/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bai1;
import java.rmi.RemoteException;
import java.rmi.Remote;

/**
 *
 * @author Nghia
 */
public interface Calculator extends Remote{
    public double square(double a) throws RemoteException;
    
}
