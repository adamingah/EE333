/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE333;

/**
 *
 * @author AdamI
 */
public class WhileDemo {
    // Converting the previous FOR loop into a WHILE loop
    
    public static void WhileLoops(){
    
        int index = 0;
        System.out.println("Index                               Value");
        System.out.println("==============================================");
        while (index < 10){
            System.out.println(index + "                           " + 2*index );
            index++;
        }
        System.out.println("==============================================");
        System.out.println("");
    
    }
    public static int WhileLoops(int start, int increment, int end){
    // Validate input arguments
    int count = 0;
    int current = 0;
    
            
    
    if ((increment > 0) && (start < end)){
    // do something
    // current += increment
    
        current = start;
        while( current < end){

            current = current + increment;
            count++;
        }
 
    } else if (( increment < 0) && (start > end)){
    
        current = start;
        
        while ( current > end ) {
            current = current + increment;
            count++;
        }
    
    } else {
        // Increment is 0 and the start and end values are wrong 
        count = 0;
        
    }
    
            
     
           
    
    return(0);
    }
}
