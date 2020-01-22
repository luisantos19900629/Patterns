/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;
import singleton.AppAccessPoint.AppAccessPoint;
/**
 *
 * @author Luis Santos
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Singleton instance = Singleton.getInstance();
        AppAccessPoint FirstLoginAttempt = AppAccessPoint.getIntanciaApp(); 
        FirstLoginAttempt.setLogin("UserID: XPTO2020");
        System.out.println(FirstLoginAttempt.getLogin());
        AppAccessPoint SecondLoginAttempt = AppAccessPoint.getIntanciaApp(); 
        System.out.println(SecondLoginAttempt.getLogin());
        
    }
    
}
