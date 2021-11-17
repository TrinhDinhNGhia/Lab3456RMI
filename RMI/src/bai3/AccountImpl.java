/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Nghia
 */
public class AccountImpl extends UnicastRemoteObject implements Account {
   private float balance = 0;
   private String name = "";
   // Constructor tạo một tài khoản mới với tên đã cho
 public AccountImpl() throws RemoteException
 {

 }
 public AccountImpl(String aName) throws RemoteException {
 name = aName;
 }
   @Override
 public String getName() throws RemoteException {
 return name;
 }
   @Override
 public float getBalance() throws RemoteException {
 return balance;
 }
 //Rút một số tiền
   @Override
 public void withdraw(float amt) throws RemoteException {
 balance -= amt;
 //Đảm bảo số dư không bao giờ giảm xuống dưới 0
 balance = Math.max(balance, 0);
 }
 //Gửi một số tiền
   @Override
 public void deposit(float amt) throws RemoteException {
 balance += amt;
 }
 //Chuyển một số tiền từ tài khoản (từ xa) khác vào tài khoản này
   @Override
 public void transfer(float amt, Account src) throws RemoteException
{
 src.withdraw(amt);
 this.deposit(amt);
}
    
}
