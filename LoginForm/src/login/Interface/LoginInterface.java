/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package login.Interface;

/**
 *
 * @author Nghia
 */
import java.rmi.*;
public interface LoginInterface extends Remote {
    public boolean getLogin(String user,String pass) throws RemoteException;
    
}
