/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bai3;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Nghia
 */
public interface Account extends Remote {
    public String getName() throws RemoteException;
    public float getBalance() throws RemoteException;
    public void withdraw(float amt) throws RemoteException;
    public void deposit(float amt) throws RemoteException;
    public void transfer(float amt, Account src) throws RemoteException;
}
