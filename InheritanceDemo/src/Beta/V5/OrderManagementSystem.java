
package Beta.V5;

/**
 *
 * @author adamingah
 */
public class OrderManagementSystem {
    
    
    public static void main(String[] args){
        
        
        AddressInfo NewShippingAddress = new AddressInfo("sdfsf", "auroa,", "AL", "2324");
      
        
        
    }
    
}
interface Exportable {
    String toCustom();
    String toXML();
    

}

class CustomerInfo implements Exportable {
    private String ID;
    private String Name;
    private String Email;
    // Street, City, State, Zip
    
    private AddressInfo ShippingAddress;
    private AddressInfo BillingAddress;
    
    public CustomerInfo(String ID, String Name, String Email){
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;
        
        
        
        // Options:
        // Set null addresses, Just remember to check
            // this.ShippingAddress = null;
        // Set default addresses
        this.ShippingAddress = new AddressInfo(Name, ID, Name, ID);
        this.BillingAddress = new AddressInfo("","","","");
    }
    
    public CustomerInfo(String ID, String Name, String Email, String Street, String City, String State, String ZipCode ){
        // Individual fields --> call the address info constructor
       
    }
    
    public CustomerInfo(String ID, String Name, String Email, AddressInfo ShippingAddress, AddressInfo BillingAddress){
        // get an entire addressInfo object for the shippingAddress
        // passing through from the customerInfo to addressinfo
        // everytime you add a new field to the address info, you also need to add it to customerINfo
    }
    
    public CustomerInfo(String ID, String Name, String Email, AddressInfo ShippingAddress){
        
    }

    // Replace the entire shipping address
    public boolean setShippingAddress( AddressInfo NewShippingAddress){
        boolean results;
        if ( NewShippingAddress == null){
            results = false;
            
            
        } else {
            this.ShippingAddress = NewShippingAddress;
        }
        return(true);
        
    }
    
    public AddressInfo getShippingAddress(){
    return(this.ShippingAddress);
    
    }
    
    public boolean getShippingAddressStreet(String Street){
       // this.ShippingAddress.getStreet(Street);
        return(true);
        
        
        
    }

    @Override
    public String toCustom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}


class AddressInfo implements Exportable {
    private String Street;
    private String City;
    private String State;
    private String ZipCode;
    
    private AddressInfo(){
        this.Street = "";
        this.City = "";
        this.State = "";
        this.ZipCode = "";
        
      
    }
    
    public AddressInfo(String Street, String City, String State, String ZipCode){
        // 
        this.Street = Street;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
    }
    
    public void setStreet(String Street){
        this.Street = Street;
    }
    public void setCity(String City){
        this.City = City;
    }
    public void setState(String State){
        this.State = State;
    }
    public void setZipCode(String ZipCode){
        this.ZipCode = ZipCode;
    }
    
    public String getStreet(){
        return(this.Street);
    }
    
    
    
    
    public boolean isValid(){
        return (false);
    }

    @Override
    public String toCustom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
