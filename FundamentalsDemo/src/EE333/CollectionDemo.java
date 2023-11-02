/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE333;

/**
 *
 * @author AdamI
 */
public class CollectionDemo {
    
    // ArrayWithInts1DDemo
    // ArrayWithInts2DDemo
    // ArrayWithStringsDemo
    
    
    
    
    public static void ArrayWithInts1DDemo(){
    
        int count;
        boolean done;
        int current;
                
        int[] A; // Null
        A = new int [10]; // Calls the array constructor
        
        int[] B = {0, 1, 2, 3, 4};
        int[] C;
        
        int max;
        
        
        int index;
        java.util.Scanner Scanner = new java.util.Scanner(System.in);
        
        
        for ( index = 0; index < 5; index++){
        
        System.out.println("Index: " + index + ", " + B[index]);
        
    
        }  
        
        index = 0;
        count = 0;
        max = 0;
        done = false;
        
//        System.out.println("How many numbers would you like?");
//        
//        
//        if (max <= 0){
//            System.out.println("Error: Please procide a positive number!");
//        } else {
//        C = new int[ max ];
//        }
        
    do{
        System.out.println("How many numbers would you like?");
        max = Scanner.nextInt();
        
    
    } while (max <= 0);
    C = new int[max];
    
    // we are only going to store positive integers up to max value.
    while (( done == false) && (count < max)){
        System.out.println("Please enter a positive integer, or -1 to exit.");
        current = Scanner.nextInt();
        if ( current == -1){
        done = true;
        
        } else if ( current < -1 ) {
            System.out.println("ERROR: Invalid value");
            
        
        
        } else {
        // add it to our array... (do something)
        C[index] = current; 
        count++; // keeps track of the actual use of the array.
        
        
        }
        
    }
        
    for ( index = 0; index < count; index++){
        System.out.println("C[ " + index + " ] = " + C[ index]);
    }

    }
    
    public static void ArrayWithInts2DDemo(){
        int[][] D;
        
        int[][] E = {{0,1,2},{3,4,5}}; // 2 row, 3 column
        
        int[][] F = new int[4][5]; // 4 row, 5 column
        
        for (int row_index = 0; row_index < 2; row_index++){
            for ( int column_index = 0; column_index < 3; column_index++){
                System.out.println("E[ " + row_index + " ][ " + column_index + " ] =" + E[row_index][column_index]);
            }
            
            // allows you to reuse variable...
            // iteration variatble or iterator...
            
            
            
            }
        for ( int row_index = 0; row_index< 10; row_index++){
            
        }
    }

    public static void ArrayWithStringsDemo(){
    java.lang.String[] Names = new java.lang.String[3]; // 3 is just random
    
    // String Names = new String[3];
    
    java.util.Scanner Scanner = new java.util.Scanner(System.in);
    
    int count = 0;
    int index = 0;
    
    int max = 3;
    java.lang.String current; // = "";
    boolean done = false;
    
    for( index = 0; index < 3; index++){
    
        System.out.println("Names[ " + index + " = " + Names[index]);
        
    
    }
    
    do {
        System.out.println("Please enter a name or 'exit': ");
        current = Scanner.nextLine();
        
        if( current.equalsIgnoreCase("exit")== true){
        
            done = true;
        
        } else {
        
        // add it to the array...
        // validition on the input from the user...
        if (count < max){
            Names[count] = current;
            
        
        } else {
        
        // resize the array...
        // grows the array by one at a time
        Names = java.util.Arrays.copyOf(Names, max + 1); // grows the array by one
        
        }
        index++;
        
        
        }
        
    
    } while (done == false);
    
    
    
    
    
    
    
    }
    
    public static void ArrayListWithStringsDemo(){
    java.util.Scanner Scanner = new java.util.Scanner(System.in);
    java.util.ArrayList<java.lang.String> Names = new java.util.ArrayList<java.lang.String>();
    // ArrayList(String> Names = new ArrayList<String>();
    
    String current;
    boolean done = false;
    
    do { 
        System.out.println("Please enter a name or exi");
        current = Scanner.nextLine();
        
        if ( current.equalsIgnoreCase("exit")== true){
        done = true;
        
        } else {
        // add it to the arraylist
        Names.add(current);
        // take a look at the methods and properties associated with an array list
        }
        
        
    } while(done == false);
    
    for (int index = 0; index < Names.size(); index++){
        System.out.println(Names.get(index)); // Names[index] <-- array
        
    }
    }
    
    public static void ArrayListOfObjectsDemo(){
    
    java.util.Scanner Scanner = new java.util.Scanner(System.in);
    java.util.ArrayList<EE333.collectedInfo> Results =  new java.util.ArrayList<EE333.collectedInfo>(); 
    
    String FirstName;
    String LastName;
    String BlazerID;
    String Goals;
    String Response;
    
    EE333.collectedInfo Current;
    int index;
    boolean done = false;
    
    do{
        System.out.println("Do you have a user to enter? Yes/No");
        Response = Scanner.nextLine();
        
        if (Response.equalsIgnoreCase("no") == false){
            
            done = true;
            
            // for each - come back to
            
            for (index = 0; index < Results.size(); index++){
                
                // results[index] <-- arrays
                System.out.println(Results.get(index).toXML());
                
                
                
                
            }
        
        } else if (Response.equalsIgnoreCase("yes") == true){
        
        
        
        System.out.println("Please enter a FirstName:");
        FirstName = Scanner.nextLine();
        
        System.out.println("Please enter a LastName:");
        LastName = Scanner.nextLine();
        
        System.out.println("Please enter a BlazerID:");
        BlazerID = Scanner.nextLine();
        
        System.out.println("Please enter a goal:");
        Goals = Scanner.nextLine();
        
        Current = new EE333.collectedInfo(FirstName, LastName, BlazerID, Goals);
       
//        Current = new EE333.collectedInfo();
//        Current.FirstName = FirstName;
//        Current.LastName = LastName;
//        Current.BlazerID = BlazerID;
//        Current.Goals = Goals;
        } else {
            
        
        }
        
        
        
    
    } while ( done == false);
    
    
    
    }
    
    
    public static void ArrayListofObjectExporter(java.util.ArrayList<EE333.collectedInfo> Results){
        
        // static function that allows for us t oexport/write teh contents of an ArrayList
        
        java.io.File ExportFile; // wrapper class that helps with access to files
        java.io.FileWriter ExportFileWriter;
        
        
        try{
            ExportFile = new java.io.File("Output.txt");
            ExportFileWriter = new java.io.FileWriter(ExportFile);
            
            for (int index = 0; index < Results.size();index++){
                
              //  System.out.println(Results.get(index).toXML());
                ExportFileWriter.write(Results.get(index).toCSV());
            }
                
            ExportFileWriter.close();
            
                
        
        } catch (Exception ex){
            System.out.println("Exception thrown");
            System.out.println(ex.toString());
        } finally{
        // not used right now...
        }
        
    
    }
    
    
    
    
            
    
    public static java.util.ArrayList<EE333.collectedInfo> ArrayListofObjectImporter(String FileName){
        
        java.util.ArrayList<EE333.collectedInfo> Results = new java.util.ArrayList<EE333.collectedInfo>();
        
        EE333.collectedInfo Current;
        
        
        java.io.File ImportFile;
        java.io.FileReader ImportFileReader;
        java.io.BufferedReader ImportBufferedReader;
        ImportFile = new java.io.File("Output.");
        ImportFile = new java.io.File( FileName);
        String Line;
        
        
        if(ImportFile.exists() == true){
        // then we attempt in opening it..
            try{
                ImportFileReader = new java.io.FileReader(ImportFile);
                ImportBufferedReader = new java.io.BufferedReader(ImportFileReader);
                
                // continuue reading from the file until there is a null string...
                while (( Line = ImportBufferedReader.readLine()) != null){
                    // we have a non null string...
                    // we want to pass it to our import function (fromCSV)
                    // if we have a valid line --> create an object...
                    //  add the obejct to the collection
                    
                    try{
                    Current = EE333.collectedInfo.fromCSV(Line);
                    Results.add(Current);
                    

                    
                    } catch ( Exception ex){
                        System.out.println(ex.toString());
                    
                    }
                    
                    
                    
                    
                
                }
                
                ImportBufferedReader.close(); // close the buffered reader first
                ImportFileReader.close(); // close the reader..
                ImportFileReader.close();
                
                
                
            } catch (java.io.IOException IOEx){
                System.out.println(IOEx.toString());
                
            
            }
        
        } else {
            System.out.println("Warning: Input File '" + FileName + "' doesn't exist!");
        }
        
        return(Results);
        
        
    }
  
    
}

