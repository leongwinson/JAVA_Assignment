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
public class Customer {
    public String CustID;
    public String Fname;
    public String Lname;
    public String Gender;
    public String DOB;
    public String PHnum;
    public String address;
    
    public String getCustID(){
        return CustID;
    }
    public void setCustID(String c){
        CustID = c;
    }
    public String getFname(){
        return Fname;
    }
    public void setFname(String f){
        Fname = f;
    }
    public String getLname(){
        return Lname;
    }
    public String getGender(){
        return Gender;
        
    }
    public void setGender(String g){
        Gender = g;
    }
    public String getDOB(){
        return DOB;
    }
    public void setDOB(String d){
        DOB = d;
    }
    public String getPHnum(){
        return PHnum;
    }
    public void setPHnum(String p){
        PHnum = p;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String a){
        address = a;
    }
}
