/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EE333;

/**
 *
 * @author AdamI
 */
public class FundamentalsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int index = 0;
        
        System.out.println("count: " + args.length);
        
        for ( index = 0; index < args.length; index++){
            System.out.println("args[ " + index + " ] = " + args[index]);
        }
        
        if (args.length == 2){
            // help
            
        } else if ((args.length == 0 ) && (args[0].compareToIgnoreCase("Testing") == 0)){
            boolean Results;
            
//            Results = EE333.ParseDemo.ParseIPAddress("192.168.1.1");
//            System.out.println("Results: " + Results);
//            
//            Results = EE333.ParseDemo.ParseIPAddress("2048.345.0.24324324");
//            System.out.println("Results: " + Results);
//            
//            Results = EE333.ParseDemo.ParseIPAddress("192l168e111");
//            System.out.println("Results: " + Results);

    Results = EE333.ParseDemo.ParseEmail("adingah@uab.edu");
        
        
        } else {
        
        
        }
        
        
        
        try {
     
            
        
        } catch(Exception ex){
            System.out.println(ex.toString() ); // toString --> summary function that gives a string description 
            // of the object
            
            
                                                  
                                                  
            
        }
        
        // TODO code application logic here
        System.out.println("Count:");
        for (index = 0; index < args.length; index++){
            System.out.println("args[ " + index + "] = " + args[index]);
         }
        
        if (args.length == 0){
        // call help = implicit
        // help;
        //why does anything exist? what if there was nothing to exist
        //there has to be something beyond us that we don't understand or ever
        // could possibly understand.
                
        }
    }
    
}
