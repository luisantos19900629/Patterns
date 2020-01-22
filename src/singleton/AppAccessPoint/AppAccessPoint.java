/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.AppAccessPoint;

/**
 *
 * @author Luis Santos
 */
public class AppAccessPoint {
 
   private static AppAccessPoint intanciaApp = null;
   
           private String login;
           
           

    
           
   private AppAccessPoint() {
      // impede instanciação externa....
      
   }
   
   public static AppAccessPoint getIntanciaApp() {

      if(intanciaApp == null) {
         intanciaApp = new AppAccessPoint();
      }
      return intanciaApp;
   }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    } 
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

