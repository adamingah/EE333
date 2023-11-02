package CMS;

    /**
     * CustomerInfo object:
     * This object is the blueprint for other instances, so  you can  
     * call CustomerInfo again, and again (to make new customers)
     */

public class CustomerInfo {
    // capsulation...
    private String ID;
    private String FirstName;
    private String LastName;
    private String Address;
    private String Email;
    private CustomerInfoStatus Status;
    
    
    
    // enumurator (enum) gives our customer a pre-defined status
    public enum CustomerInfoStatus{

        Active,
        Inactive,
        Unknown,
        Dirty
        
    }
    
    public CMS.CustomerInfo.CustomerInfoStatus getStatus(){
    
        return(this.Status);
        
    }
    
    
    public boolean setStatus(CMS.CustomerInfo.CustomerInfoStatus newStatus){
    
        boolean results = false;
        // Write logic so that only some of the statuses are updatable externally (from customerinfomanager)
        
        if (newStatus == CMS.CustomerInfo.CustomerInfoStatus.Unknown){
        
            // warning...
            results = false;
            
        } else {
            results = true;
            this.Status = newStatus;
        
            
        }
        
        return(true);
    }
     
    
    /**
     * @return the ID
     */
    public String getID() {
        return (this.ID);
        
        
        // return ID;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return (this.FirstName);
    }

    
    // These setters are examples of methods. They are boolean methods, meaning
    // that when they return true, it means it worked.
    
    /**
     * @param FirstName the FirstName to set
     * @return true (it worked)
     */
    public boolean setFirstName(String FirstName) {
        this.FirstName = FirstName;
        return(true);
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return (this.LastName);
    }

    /**
     * @param LastName the LastName to set
     * @return true (it worked)
     */
    public boolean setLastName(String LastName) {
        this.LastName = LastName;
        return(true);
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return (this.Address);
    }

    /**
     * @param Address the Address to set
     * @return true
     */
    public boolean setAddress(String Address) {
        this.Address = Address;
        return(true);
        
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return (this.Email);
    }

    /**
     * @param Email the Email to set
     * @return true
     */
    public boolean setEmail(String Email) {
        this.Email = Email;
        return(true);
    }

    
    public CustomerInfo(String ID, String Email){
        
       this.Status = CMS.CustomerInfo.CustomerInfoStatus.Unknown;
       this.ID = "";
       this.Email = "";
       this.FirstName = "";
       this.LastName = "";
       this.Address = "";
       
        
        
        // Checking if the inputs are legit
        if((ID == null) || (ID.length() == 0)){
            
            System.out.println("Error: Please enter a valid ID.");
            
            //throw new Exception("Warning: Invalid ID passed.");
        
        } else if ((Email == null) || (Email.length() == 0)){
        
            System.out.println("Error; Please enter a valid email.");
            this.Status = CMS.CustomerInfo.CustomerInfoStatus.Active;
            this.ID = ID;
            
        
        } else {
        
            this.Status = CMS.CustomerInfo.CustomerInfoStatus.Active;
            this.ID = ID;
            this.Email = Email;
            
        }
        
    
    }
    
    public CustomerInfo(String ID, String FirstName, String LastName, String Address, String Email){
    
       this.Status = CMS.CustomerInfo.CustomerInfoStatus.Unknown;
       this.ID = "";
       this.Email = "";
       this.FirstName = "";
       this.LastName = "";
       this.Address = "";
       
       if ((ID == null)||(ID.length()==0)){
           System.out.println("Error: Please enter a valid ID");
           //throw new Exception("Warning: Invalid ID passed");
           
       } else {
       
           if ((Email == null) || (Email.length() == 0) || (validateEmail(Email) == false)){
               System.out.println("");
               this.Email = "";
               
           } else {
               this.Email = Email; //for a valid email...
           }
           
           
           // More if if...else... for the non critical fields.
       }
    }
    
    private boolean validateFields(){
        // Validates all fields
        // Doesn't need an arg because it is an instance method
        // knows about itself
        // Ex: this.firstname
                
        return( true );
    }
    
    private boolean validateEmail(String Email){
        boolean results = true;
        // use regular expressions, pattern matching...
        
        if ((Email == null) || (Email.length() == 0)){
            results = false;
            
        } else if ( Email.length() < 5){
            results = false;
            
        } else if (( Email.contains("@") == false) || (Email.contains(".") == false)){
            results = false;
        } else {
            results = true;
        }
        
       // What are we returning here?
       
       
       return(results);
    }
    
    @Override
    public String toString(){
        return("");
        
    }
    public String toCustom(){
        return("");
        
    }
    public String toCSV(){
        return("");
        
    }
    
    public CMS.CustomerInfo fromCustom(String input){
        return(null); // This isn't good...
    }
    
    public CMS.CustomerInfo fromCSV(String input){
        return(null); // This isn't good...
    }
    
    public CMS.CustomerInfo fromXML(String input){
        return(null); // This isn't good...
    }
    
    public CMS.CustomerInfo fromJSON(String input){
        return(null); // This isn't good...
    }
    
    
}
