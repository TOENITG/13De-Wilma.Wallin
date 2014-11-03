/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package konsolapplikation;
import javax.swing.JOptionPane; 
/**
 *
 * @author Kei
 */
public class Konsolapplikation {

    
    public static double meow(){ 
// meow fixar så jag kan skriva nummer i en pop upp ruta. :) 
        
        double rawr=0;
        
        boolean korv = true;
        
        while(korv){
            try{ 
            rawr = Double.parseDouble(JOptionPane.showInputDialog(null));
        
            korv = false;
            
            }catch(NumberFormatException e){ 
// Catch gör så programmet fortsätter trots felmeddelande mellan måsvingarna.
                
                JOptionPane.showMessageDialog(null, "For gods *** Try again..");
                
            }
        }
        
        return rawr;
    }
    
    public static void main(String[] args) {
        
         double answer = meow()+meow();
        
         JOptionPane.showMessageDialog (null, "Addition: "+ answer);
         
         answer -= meow();
         
        JOptionPane.showMessageDialog (null, "Subtraktion: "+ answer);
        
        answer *= meow();
        
        JOptionPane.showMessageDialog (null, "Multiplikation: "+ answer);
        
        answer /= meow();
        
        JOptionPane.showMessageDialog (null, "Division: "+ answer);
        
         
    }
    
}
