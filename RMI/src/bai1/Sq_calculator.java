/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bai1;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 *
 * @author Nghia
 */
public class Sq_calculator extends UnicastRemoteObject implements Calculator{
// Khai báo phương thức khởi tạo
public Sq_calculator() throws RemoteException{
}
// Viết xử lý cho phương thức tính bình phương
@Override
public double square(double a) throws RemoteException {
 return a*a;
}
}