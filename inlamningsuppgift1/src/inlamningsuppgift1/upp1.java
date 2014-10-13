/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inlamningsuppgift1;
import javax.swing.JOptionPane;
/** Skapar en class som är lokaliserad i javax.swing
/**
 *
 * @author Kei
 */
public class upp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String first_name; 
        first_name = JOptionPane.showInputDialog("Ditt namn");
        /** Namnet ska skrivas in */
        String person_name;
        person_name = JOptionPane.showInputDialog("Ditt Personnummer");
        /** Här ska personen skriva in sitt personnummer */
        String adress_name;
        adress_name = JOptionPane.showInputDialog("Din Address");
        /** Addressen till personen ska in här */
       String full_name;
        full_name = "Välkommen " + first_name + "." + " Då du fyller den " + person_name + " kommer vi komma till dig, " + adress_name + " och fira dig :D";
        JOptionPane.showMessageDialog(null, full_name);
        System.exit(0);
// TODO code application logic here
    }
    
}
