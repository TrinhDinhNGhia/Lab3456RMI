/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.Implement;

/**
 *
 * @author Nghia
 */
import java.rmi.server.UnicastRemoteObject;
import login.Interface.LoginInterface;
import java.rmi.*;
public class LoginImplement extends UnicastRemoteObject implements LoginInterface {

    public LoginImplement() throws RemoteException
    {
        
    }
    @Override
    public boolean getLogin(String user, String pass) throws RemoteException {
       boolean found= false;
       try
       {
           if(user.equals("admin")&&pass.equals("123"))
           {
               return found=true;
           }
           else
           {
               return found=false;
           }
        
       }catch(Exception ex)
       {
       ex.printStackTrace();
       }
       return found;
    }
    
    
}
