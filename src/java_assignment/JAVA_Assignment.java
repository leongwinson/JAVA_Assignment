/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Vincent Leong
 */


public class JAVA_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
         
        
       File f = new File("login.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String row[] = sc.nextLine().split(",");
            System.out.println(row[0] + row[1]);
        }
        }catch(IOException e){
            System.out.println("file not found");
                
                }
        
    }
    
}
