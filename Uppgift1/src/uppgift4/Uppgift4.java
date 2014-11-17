

package uppgift4;

import java.util.Scanner;

public class Uppgift4 {

   
    public static void main(String[] args) {
   int p = 0; // p = poäng. p++; för att få ut ett poäng.
        
    Scanner scan = new Scanner ( System.in );
    
    System.out.println("Hejsan! Du måste svara på dessa 10 frågor! \n\nFinns Katter?");
    
    if(scan.next().equalsIgnoreCase("ja")){ 
//equalsIgnoreCase ignorerar versaler så användaren 
//kan skriva i varsaler om hen vill.
        p++;
    }
    
    
    System.out.println("Vad heter killen som upptäckte dynamiten i förnamn?");
    
    if(scan.next().equalsIgnoreCase("alfred")){
        p++;
    }
    
    System.out.println("Vad heter den minsta planeten i vårat solsystem?");
    
    if(scan.next().equalsIgnoreCase("merkurius" )){
        p++;
    }
    
     System.out.println("Vad heter den största planeten i vårat solsystem?");
    
    if(scan.next().equalsIgnoreCase("jupiter" )){
        p++;
    }
    
     System.out.println("Vad kallas en ko som inte fått kalvar?");
   
    if(scan.next().equalsIgnoreCase("kviga")){
        p++;
    }
    
     System.out.println("Är sterilitet ärftligt?");
   
    if(scan.next().equalsIgnoreCase("nej")){
        p++;
    }
    
     System.out.println("Vilken färg är en brun katt?");
   
    if(scan.next().equalsIgnoreCase("brun")){
        p++;
    }
    
    
    
     System.out.println("Hur många händer har en katt? \npssst.. svara med siffror");
   
    if(scan.next().equalsIgnoreCase("0")){
        p++;
    }
    
    
     System.out.println("Var startades AC/DC?");
   
    if(scan.next().equalsIgnoreCase("australien")){
        p++;
    }
    
     System.out.println("Vad är Angus Young för musiker?");
   
    if(scan.next().equalsIgnoreCase("gitarrist")){
        p++;
    }
    
    
   System.out.println(p + " utav 10");
    
 }
    
}
