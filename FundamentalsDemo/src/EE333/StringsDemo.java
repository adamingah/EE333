/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EE333;

/**
 *
 * @author AdamI
 */
public class StringsDemo {
    
    public static void GetcollectedInfo(){
        EE333.collectedInfo SamplecollectedInfo = new EE333.collectedInfo();
        java.util.Scanner Scanner = new java.util.Scanner(System.in);
        
        System.out.println("Please enter a FirstName:");
        SamplecollectedInfo.FirstName = Scanner.nextLine();
        
        System.out.println("Please enter a LastName:");
        SamplecollectedInfo.LastName = Scanner.nextLine();
        
        System.out.println("Please enter a BlazerID:");
        SamplecollectedInfo.BlazerID = Scanner.nextLine();
        
        //EE333.StringsDemo.DisplaycollectedInfo(SamplecollectedInfo);
        
        System.out.println("SamplecollectedInfo.toString()"); //calls out own toString() methodb
        
        
        
        
    }
    
    public static EE333.collectedInfo GetcollectedInfoAsObject(){
    
        EE333.collectedInfo SamplecollectedInfo; // Null
        SamplecollectedInfo = new EE333.collectedInfo(); // calls the constructor
    
       EE333.collectedInfo collectedInfo = new EE333.collectedInfo();
        java.util.Scanner Scanner = new java.util.Scanner(System.in);
        
        System.out.println("Please enter a FirstName:");
        SamplecollectedInfo.FirstName = Scanner.nextLine();
        
        System.out.println("Please enter a LastName:");
        SamplecollectedInfo.LastName = Scanner.nextLine();
        
        System.out.println("Please enter a BlazerID:");
        SamplecollectedInfo.BlazerID = Scanner.nextLine();
        
        EE333.StringsDemo.DisplaycollectedInfo(SamplecollectedInfo);
        
        return(SamplecollectedInfo);
        
    }
    
    public static void DisplaycollectedInfo(EE333.collectedInfo SamplecollectedInfoToDisplay){
        System.out.println("FirstName:" + SamplecollectedInfoToDisplay.FirstName);
        System.out.println("LastName:" + SamplecollectedInfoToDisplay.LastName);
        System.out.println("BlazerID:" + SamplecollectedInfoToDisplay.BlazerID);
        System.out.println("Goals:" + SamplecollectedInfoToDisplay.Goals);
        System.out.println("ToString: " + SamplecollectedInfoToDisplay.toString());
        
        
    }
}

//public static void FromCSVDemo(){
//
//    String SampleLine = "Adam,Ingah,adingah,Survive.";
//    //System.out.print
//
//    //EE333.collectedinfo.fromCSV(SampleLine);
//    
//    //try {
//
//   // } catch(Exception ex){
//   // s
//   // }
//
//}

class collectedInfo{
// initially we want to think of these as structures/containers
    
    public String FirstName = ""; // declaration and initialization to ""
    public String LastName = "";
    public String BlazerID= "";
    public String Goals = "";
    
    // explicitly created constructor
    public collectedInfo(){
        
    this.FirstName = "";
    this.LastName = "";
    this.BlazerID = "";
    this.Goals = "";
    
    }

    public collectedInfo(String BlazerID){
    
        this.BlazerID = BlazerID;
        
        this.FirstName = "";
        this.LastName = "";
        this.Goals = "";
    }
    
    public collectedInfo(String FirstName, String LastName, String BlazerID, String Goals){
    
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BlazerID = BlazerID;
        this.Goals = Goals;
    
    }
    
    public collectedInfo(String FirstName, String LastName, String BlazerID){
    
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.BlazerID = BlazerID;
    this.Goals = "";
    
           
    }
    
    public static EE333.collectedInfo fromCustom( String input ) throws Exception {
        EE333.collectedInfo Results = null;
        
        String[] Lines;
        String Line;
        String[] Chunks; // split a line
        String Chunk;
        String Firstname = "";
        String Lastname = "";
        String BlazerID = "";
        String Goals = "";
      
        
        
        if ( input == null ) {
        throw new  Exception("Error: null input");
        
        
        } else if ( input.length() == 0){
        throw new Exception("Error: zero length string!");
                
        
        } else {
        Lines = input.split("\n"); // first \ excepts out the second slash
        
            for( int index = 0; index < Lines.length; index++){
                Line = Lines[index]; // working with an individual line
                Chunks = Line.split(": "); // name: value
                if(Chunks.length == 2){
                    
                    if(Chunks[1].length() == 0){
                        
                        System.out.println("Warning: Zero length value was provided");
                    
                    
                    } else if(Chunks[0].equalsIgnoreCase("firstname")==true){
                        
                        Firstname=Chunks[1];
                        
                    
                    } else if (Chunks[0].equalsIgnoreCase("lastname")== true){
                        
                        Lastname=Chunks[1];

                    } else if (Chunks[0].equalsIgnoreCase("BlazerID")== true){
                        
                        BlazerID = Chunks[1];
                        
                    } else if (Chunks[0].equalsIgnoreCase("goals")== true){
                        
                        Goals = Chunks[1];
                    
                    
                    } else {
                        System.out.println("Warning: Unhandled field"); // probably include field name and value
                    }
                        
                    
                
                } else {
                    System.out.println("Warning: Unhandled Line!");
                    
                
                
                }
                
            } 
            
            if (( BlazerID.length() > 0) && (Firstname.length()> 0) && (Lastname.length() > 0) && (Goals.length()> 0)){
            
                Results = new EE333.collectedInfo(Firstname, Lastname, BlazerID, Goals);
                
            } else if (BlazerID.length()>0){
                Results = new EE333.collectedInfo(BlazerID);
                
                
            } else {
                throw new Exception("Error: Failed to parse input!");
            
            }
        
        
        }
        
        
        
        return(Results);
    }
    
    public static EE333.collectedInfo fromCSV(String Input) throws Exception{
    EE333.collectedInfo Results = null;
    
    String[] Chunks = null;
    String FirstName;
    String LastName;
    String BlazerID;
    String Goals;
    
    
    // Will we allow the function to return NULL;
        // Calling function will have to check the return value
        // if (EE333.CollctedInfo.FromCSV("Some string...") == null)...
    // ORRRRR Will we throw an exception;
        //the calling function has to be prepared to catch it...
        
    // Third Option...
    //  include an enum...
    
    
    if ( Input == null){
        // There is a problem...
        throw new Exception();
        
        
    } else if (Input.length() == 0){
        // Again, there is a problem
        
    
    } else {
        Chunks = Input.split(","); // 4 chunks
        
        if (Chunks.length == 4) {
            // we initialize our object after indeitfying/validating the individual chunks
            
            
            
            FirstName = Chunks[0];
            LastName = Chunks[1];
            BlazerID = Chunks[2];
            Goals = Chunks[3];
            
            if (BlazerID.length() == 0){
                // We have a problem...
                
                // ) else if () { - additional critial validatoin...
                
                
            } else {
                // we assume that we have enough information to get started...
                Results = new EE333.collectedInfo(FirstName, LastName, BlazerID, Goals);
                Results = new EE333.collectedInfo(BlazerID);
                
                Results.FirstName = FirstName;
                Results.LastName = LastName;
                Results.Goals = Goals;
                
                
            
            
            }
            
        
        } else {
            // we have a problem...
            
        }
        
    
    }
    
    
    
    return(Results);
    
    
    }
    
    public java.lang.String toCustom(){
    
        String output = "";
        output += "FirstName:" + this.FirstName+ '\n';
        output += "LastName:" + this.LastName+ '\n';
        output += "BlazerID:" + this.BlazerID+ '\n';
        output += "Goals:" + this.Goals+ '\n';
        
        return(output);
        
        
    }
    
    public String toCSV(){
    
    java.lang.String output = "";
    output += this.FirstName + ",";
    output += this.LastName + ",";
    output += this.BlazerID + ",";
    output += this.Goals + "\n"; // newline here is up for debate
    
    return(output);
    
    }
    
    public String toXML(){
    
    String output = "";
    
    //Markup langage --> leverages tags --> used to describe the object
    output += "<collectedInfo>" + '\n'; // Open tag
    
    output += "  <FirstName>" + this.FirstName + "</FirstName>" + '\n';
    output += "  <LastName>" + this.LastName + "</LastName>" + '\n';
    output += "  <BlazerID>" + this.BlazerID + "</BlazerID>" + '\n';
    output += "  <Goals>" + this.Goals + "</Goals>" + '\n';
    
    
    output += "</collectedInfo>" + '\n'; // Close tag
    
    
    
    
    return(output);
    }
    
    public String toJSON(){
    String output = "";
    return(output);
    }
    
   public static collectedInfo FromCSV(String Input) throws Exception{
   
       String[] Chunks;
       Chunks = Input.split(",");
       EE333.collectedInfo results = null;
       
       
       if (Chunks.length == 4){
       
           results = new collectedInfo(Chunks[0], Chunks[1], Chunks[3]);
       } else {
       // throw an exception
       }
       
       return(results);
   }
}
    
    
