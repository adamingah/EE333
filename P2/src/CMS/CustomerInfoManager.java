
package CMS;

/**
 *
 * @author adamingah
 */
public class CustomerInfoManager {
    
    private static SettingInfo CurrentSettingInfo;
    private static java.util.ArrayList<CMS.CustomerInfo> Customers = new java.util.ArrayList<CMS.CustomerInfo>();


     
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int index;
        
        CurrentSettingInfo = new SettingInfo();
        CurrentSettingInfo.repository = "Sample.csv";
        CurrentSettingInfo.format = "csv";
        
        // Argument counter ____________________________________________________
        System.out.println("args.length: " + args.length);
        
        
        for (index = 0; index < args.length; index++){
            
            System.out.println("args[ " + index + " ]: " + args[index]);
        }
        
        // SWITCHES
        if (args.length == 0 ){
        
            // Call for help because no arguments passed
            help();
            
        } else if ( (args.length == 1) && (args[0].equalsIgnoreCase("/beta") == true) ){
            // BETA TESTING SWITCH
            
            System.out.println("BETA MODE ---------------------------------");
            
            
        } else if ( (args.length == 2) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/add") == true) ){
            // Interactive
            // <ID> <Email>
            // <ID> <Firstname> <LastName> <Address> <Email>
            System.out.println("Interactive");

        } else if ( (args.length == 4) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/add") == true) ){
            // Parametric
            // <ID> <Email>
            System.out.println("Parametric");

        } else if ( (args.length == 7) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/add") == true) ){
            // Parametric
            // <ID> <Firstname> <LastName> <Address> <Email>
            System.out.println("Parametric");    
            
        } else if ( (args.length == 2) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/search") == true) ){
            // Interactive
            // ID=<ID>
            // field=<field> value=<value>
            System.out.println("Interactive");
            
        } else if ( (args.length == 3) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/search") == true) ){
            // Parametric
            // ID=<ID>
            System.out.println("Parametric");  
            
        } else if ( (args.length == 4) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/search") == true) ){
            // Parametric
            // field=<field> value=<value>
            System.out.println("Parametric");  
            
        } else if ( (args.length == 2) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/update") == true) ){
            // Interactive
            // field=<field> value=<value>
            System.out.println("Interactive");
            
        } else if ( (args.length == 5) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/update") == true) ){
            // Parametric
            // ID=<ID> field=<field> value=<value>
            System.out.println("Parametric");
            
            
        } else if ( (args.length == 2) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/delete") == true) ){
            // Interactive
            // ID=<ID>
            System.out.println("Interactive");
            
        } else if ( (args.length == 3) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/delete") == true) ){
            // Parametric
            // ID=<ID>
            System.out.println("Parametric");
            
        } else if ( (args.length == 3) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/archive") == true) ){
            // Interactive
            // ID=<ID>
            System.out.println("Interactive");
            
        } else if ( (args.length == 3) && (args[0].equalsIgnoreCase("/Customer") == true) && (args[1].equalsIgnoreCase("/archive") == true) ){
            // Parametric
            // ID=<ID>
            System.out.println("Parametric");
            
            
        } else if ( (args.length == 3) && (args[0].equalsIgnoreCase("/export") == true) && (args[1].equalsIgnoreCase("/format") == true) ){
            // <custom | csv | xml | json>
            
        } else if ( (args.length == 3) && (args[0].equalsIgnoreCase("/setting") == true) && (args[1].equalsIgnoreCase("/repository") == true) ){
            // <filename>
            
        } else if ( (args.length == 3) && (args[0].equalsIgnoreCase("/setting") == true) && (args[1].equalsIgnoreCase("/format") == true) ){
            // <custom | csv | xml | json>
            
   
        } else {
            // Implicit call for help
            help();
            
        }
            CMS.CustomerInfo Sample = new CMS.CustomerInfo("001", "adingah@uab.edu");
    }
        
    public static void help(){
        // Help function
        
        /**
         * Command line argument support:
         *  /customer /add <ID> <Email>
         *  /customer /add <ID> <Firstname> <LastName> <Address> <Email>
         *  /customer /search ID=<ID>
         *  /customer /search field=<field> value=<value>
         *  /customer /update ID=<ID> field=<field> value=<value>
         *  /customer /delete ID=<ID>
         *  /customer /archive ID=<ID>
         *  /export /format <custom | csv | xml | json>
         *  /setting /repository <filename>
         *  /setting /format <custom | csv | xml | json>
         *
        */
     
        System.out.println("CUSTOMER INFORMATION MANAGER V1");
        System.out.println("-------------------------------------------------------------");
        System.out.println("/customer /add <ID> <Email>");
        System.out.println("/customer /add <ID> <Firstname> <LastName> <Address> <Email>");
        System.out.println("/customer /search ID=<ID>");
        System.out.println("/customer /search field=<field> value=<value>");
        System.out.println("/customer /update ID=<ID> field=<field> value=<value>");
        System.out.println("/customer /delete ID=<ID>");
        System.out.println("/customer /archive ID=<ID>");
        System.out.println("/export /format <custom | csv | xml | json>");
        System.out.println("/setting /repository <filename>");
        System.out.println("/setting /format <custom | csv | xml | json>");
        System.out.println("-------------------------------------------------------------");

        
    
    }
    
    public static java.util.ArrayList<CMS.CustomerInfo> Import(String Repository, String Format){
        return(null);   
    }
    
    public static int Export(java.util.ArrayList<CMS.CustomerInfo> Customers, String Repository, String Format){
        boolean results = true;
        
        return(0);
    }
    
    public static java.util.ArrayList<CMS.CustomerInfo> AddCustomer(java.util.ArrayList<CMS.CustomerInfo> Customers, CMS.CustomerInfo PotentialCustomer){
        return(null);
    
    }
    
    
//    // If I use a static Array list...
//    public static boolean AddCustomer(CMS.CustomerInfo PotentialCustomer){
//        return(true);
//    
//    }
    
    public static java.util.ArrayList<CMS.CustomerInfo> DeleteCustomer(java.util.ArrayList<CMS.CustomerInfo> Customers, CMS.CustomerInfo PotentialCustomer){
        return(null);
    }
    
//    // If I use a static arraylist...
//    public static boolean DeleteCustomer(CMS.CustomerInfo PotentialCustomer){
//        return(true);
//    }
    
    public static java.util.ArrayList<CMS.CustomerInfo> UpdateCustomer(java.util.ArrayList<CMS.CustomerInfo> Customers, String ID, String Fieldname, String Value){
        return (null);
    
    }
    
    public static boolean getSettingInfo(){
        // Read the contents of an XML file and adjust the application settings
        // SettingInfo.xml
        // construct a SettingInfo object (or a bunch of individual setting variables)
        java.io.File InputFile = new java.io.File("SettingInfo.xml");
        java.io.FileReader InputFileReader = null;
        java.io.BufferedReader InputBufferedReader = null;
        String Contents = "";
        String Line = "";
        
        
        if (InputFile.exists() == true){
            
            try{
                
                InputFileReader = new java.io.FileReader(InputFile);
                InputBufferedReader = new java.io.BufferedReader(InputFileReader);
                
                
               // java.nio.file.Files.readAllLines("SettingInfo.xml");
               
               while ( (InputBufferedReader.readLine()) != ""){
                   
               Contents = Contents + Line;
               
               }
                
                InputBufferedReader.close();
                InputFileReader.close();
                
                // parse the contents of the file using regular expressions
                // pattern matching
                // . - any character
                // ? - 0 or more times
                // () indictate a capture
                
              
                java.util.regex.Pattern regex = java.util.regex.Pattern.compile("<SettingInfo>(.*)</SettingInfo>");
               
                // Looks at the contents to see if we find the pattern
                java.util.regex.Matcher matcher = regex.matcher(Contents);
                // matcher.find() checs to see if the pattern was matched
                
                
                
            
            } catch (Exception ex){
                System.out.println(ex.toString() );
                
            }
        
        
        } else {
            
            // option 1: tell the user to run the "setup" utility
            // add the appropriate settings
            // to do: write a first run wizard
            // option 2: use default settings
            
        
        }
        return(true);
        
    }
    
    public static boolean setSettingInfo(){
        // Write the contents of an XML file with the updated application settings...
        // SettingInfo.xml
        
        java.io.File SettingInfoFile = new java.io.File("SettingInfo.xml");
        java.io.FileWriter SettingInfoWriter = null;
        
        try {
            
            // To do rename the existing setting file using a date time...
            
            SettingInfoWriter = new java.io.FileWriter(SettingInfoFile);
            
            
            //System.out.println(repository); // accessinga static variable form a static method
            System.out.println(CurrentSettingInfo.toXML());
            SettingInfoWriter.write(CurrentSettingInfo.toXML());
            SettingInfoWriter.close();
            
         
        } catch (Exception ex){
            System.out.println( ex.toString() );
            
            
            
        
        }        
        
        
        return(true);
    }
    
    // 10-3-2023
    public static boolean RemoveCustomer (String ID){
        int index = 0;
        int foundindex = -1;
    
        if( ID == null){
        
        } else {
        
            for (index = 0; index< Customers.size(); index++){
            
                if (Customers.get(index).getID().equalsIgnoreCase(ID) == true){
                
                    // Remove the customer
                    Customers.remove(index);
                    
                } else {
                
                    // Keep looking
                
                }
                
                
            }
            
            while (index< Customers.size()){
            
                if ( Customers.get(index).getID().equalsIgnoreCase(ID) == true){
                
                    foundindex = index;
                    break;
                }
            }
            
            if ( foundindex != -1){
            
                Customers.remove(foundindex);
                
            } else {
                // Nothing to remove...
            }
                
                
        
        }
        
        
        
        return(foundindex != -1);
    }
        
    public static boolean ArchiveCustomer(String ID){
        int index = 0;
        boolean results = false;
        
        while (results == false){
        
            if ( Customers.get(index).getID().equalsIgnoreCase(ID) == true ){
            
                Customers.get(index).setStatus(CustomerInfo.CustomerInfoStatus.Inactive);  
                results = true;
            }
        }
        
        return(results);
        
    
    }
    
    }

// Helper/convenience class
class SettingInfo{
    
    // add validation
    // change public --> private
    // add setters and getters.
    
    public String repository;
    public String format;
    
    public SettingInfo(){
        repository = "";
        format = "";
    }
    
    public String toXML(){
    
        String output = "";
        output += "<SettingInfo>\n"; // Opening tag
        // add any additional fields that the customer comes up with later.
        output += " <Repository>" + repository + "</Repository>\n";
        output += " <format>" + format + "</format>\n";
        output += "</SettingInfo>\n"; // closing tag
        
                return (output);
    }
    
    public boolean exportSettingsInfo(){
        
        // could do the same things as our setSettingInfo in the manager
        return(true);
        
    }
}

    

