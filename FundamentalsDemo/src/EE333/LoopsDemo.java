/* 
 * File: LoopsDemo.java
 * Copy: Copyright (c) 2023 Gregory C. Myers
 * BlazerID: gmyers
 * Vers: 1.0.0 08/29/2023 GCM - Original Coding
 * Desc: Driver for testing concepts 
 */ 
package EE333;

/**
 *
 * @author gmyers
 */
public class LoopsDemo {
    
    public static void ForLoops(){
        int index = 0;
        System.out.println("Index                               Value");
        System.out.println("==============================================");
        for (index = 0; index < 10; index ++){
            System.out.println(index + "                           " + 2*index );
        }
        System.out.println("==============================================");
        System.out.println("");
    
        //---------------------------------------------------------------
        System.out.println("Index                               Value");
        System.out.println("==============================================");
        for (index = 0; index < 10; index ++){
            System.out.println(index + "                           " + 2*index );
        }
        System.out.println("==============================================");
        System.out.println("");
    }
    
    public static int ForLoops(int start, int increment, int end){
        // validating our input arguments
        int count = 0;
        int current = 0;
        
        
        
        if ((increment > 0) && (start < end)){
        // do something
        // current += increment;
        
            for (current = start; current < end; current = current + increment){
                count++;
            }
        } else if (( increment < 0) && (start > end)){
            for (current = start; current > end; current = current + increment){
                count++;
            }
        
        } else {
        // increment is 0 and start and end values are wrong
        count = 0;
        }

        return(count);
    
    }
    
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
    
    public static void DoWhileLoops(){
    // do while loops check the conditon at the end of the loop...
    
    int index;
    index = 0;
    
    System.out.println("Index                               Value");
    System.out.println("==============================================");
    do {
        System.out.println(index + "                " + index*2);
        index++;
        
    } while (index < 10);{
        
    }
        System.out.println("=====================================");    
    }
        
    public static int DoWhileLoopsWithRandom(){
        
       // use java.lang.Math, specifically the random number generator to test a loop
       double balance = 100.0;
       double current = 0.0;
       int count = 0;
       
       
       do {
           // make purchases...
           current = 10 * java.lang.Math.random();
           System.out.println("balance: " + balance + ", current: "+ current);
           balance = balance - current;
           count++;
           
            
       } while (balance> 0.0);
       
        
        
    return(0);
    }
    
}
