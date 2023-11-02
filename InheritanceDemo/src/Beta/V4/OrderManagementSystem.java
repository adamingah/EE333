package Beta.V4;

/**
 *
 * @author adamingah
 */
public class OrderManagementSystem {
    public static void main(String[] args){
    
        int index;
        index = 0;
        System.out.println("Count:" + args.length);
        
        for(index = 0; index < args.length; index++){
        
            System.out.println("args[ " + index + " ] = " + args[index] );
            
            
        }
        
        CustomerInfo OMSObjectA = new CustomerInfo();
        OMSObjectA.ID = "adingah";
        OMSObjectA.Name = "Adam Ingah";
        OMSObjectA.toXML();
        OMSObjectA.toCSV();
        
        ProductInfo OMSObjectB = new ProductInfo();
        OMSObjectB.ID = "A1";
        OMSObjectB.Name = "100uF Capacitor";
        OMSObjectB.Category = "Capacitor";
        
        
        // This can be a customer, Product, or an order.
        // Why? because all of the classes are manageable (implements the interface)
        Manageable OMSObjectC;
        Manageable OMSObjectD = new CustomerInfo();
        //Manageable OMSObjectE = new ProductInfo();
        
               
        
                
        
    }  
    
}

// Interface - contract that says somethign will be there, but now how it will be done.
// note: no code, just the contract.
interface Manageable {
    public boolean Exists(String ID);
    public String toCustom();
    public String toXML();
    public String toCSV();
    
}

interface Taxable {
    public double getTaxRate();
    public double calculateTaxRate();
    public boolean isExempt();
}

//class OMSBaseInfo{
//    public String ID;
//    public String Name;
//
//    public static boolean Exists(String ID){
//        return(false);
//    }
//
//    public String toCustom(){
//        return("");
//
//   }
// }
// This class makes the customer inherit from the base class
//class CustomerInfo extends OMSBaseInfo  {


// interface - implements methods features described by contract
class CustomerInfo implements Manageable {
    public String ID;
    public String Name;
    public String Email;
    
    // Leave the subclass to choose its own implementations
    // @override
    // Do we need to inherit?
    // or do we need to guarantee that these methods/features are present
//    public static boolean Exists(String CustomerID){
//        // knows how & where to search for a customerID
//        return(false);
//    }
    // toString();
    
    public String toCustom(){
        
        return("");
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        @Override
        public boolean Exists(String ID) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   
    
}


// This follows the poorly designed falt structure (Just for the product)
class ProductInfo implements Managable {
    public String ID;
    public String Name;
    public String Category;
    
//    public static boolean Exists(String ProductID){
//        
//        return(false);
//        
//    }
    // toString;
    public String toCustom(){
        
        return("");
    }
}

class OrderInfo implements Manageable, Taxable {
    public String ID;
    public String CustomerID;
    public String ProductID;
    public int Quantity;
    public double Price;
    
    // toString();
    public String toCustom(){
        
        return("");
    }

    @Override
    public boolean Exists(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toXML() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getTaxRate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculateTaxRate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isExempt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


// To Do: Create an interface called 
// Exportable
// - toCSV();
// - toCustom();
// - toXML();
// - toJSON();



