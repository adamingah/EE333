// Version 1
package Production;
import java.util.Scanner;



public class ReceiptSplit {
    
    public static void main(String[] args){
        
        // Creating a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("RECIEPT SPLIT V1");
        
        
        
        int numberOfPeople = 0;
        
        // Ask for number of participants
        System.out.println("How many people are splititng?");
        numberOfPeople = scanner.nextInt();

        
        // Validate
        if(numberOfPeople < 0){
            
            // Reprompt them
            System.out.println("Error: Can't have less than zero people splitting");
            
        } else if(numberOfPeople > 0){
            
            // Right amount of people, continue with program
            
        
        }
        
        
        
    
    }
    
}
