/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.server;

/**
 *
 * @author Nghia
 */
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import login.Implement.LoginImplement;
public class LoginSever {
    
    public static void main(String[] args)
    {
        try
        {
                  Registry reg = LocateRegistry.createRegistry(1102);
                 LoginImplement lp=  new LoginImplement();
                 reg.rebind("login", lp);
                 System.out.println("Server is ready");
                 
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }   

    }
    
}
