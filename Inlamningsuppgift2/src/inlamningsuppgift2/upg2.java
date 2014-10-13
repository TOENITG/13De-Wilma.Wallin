/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inlamningsuppgift2;
import java.util.Scanner;
/**
 *
 * @author Kei
 */
public class upg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        
        String first_name;
        System.out.print ("Skriv en färg: ");
        first_name=user_input.next();
        System.out.println(first_name);
        
        String family_name;
        System.out.print("Skriv en annan färg: ");
        family_name = user_input.next();
        
        System.out.println(first_name + " " + family_name);
        
        String farg_name;
        System.out.print("Skriv en tredje färg: ");
        farg_name = user_input.next();
        
        System.out.println(first_name + " " + family_name +" "+ farg_name);
        
        String full_name;
        full_name= first_name + " " + family_name +" " + farg_name;
        
        System.out.println();
    }
}

    
    
