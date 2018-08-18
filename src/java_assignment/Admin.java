/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assignment;

/**
 *
 * @author Vincent Leong
 */
public class Admin {
    public String CustID;
    public String Password;
    
    public String getCustID(){
        return CustID;
    }
    public void setCustID(String c){
        CustID = c ;
    }
    public String getPassword(){
        return Password;
    }
    public void setPassword(String p){
        Password = p ;
    }
}
