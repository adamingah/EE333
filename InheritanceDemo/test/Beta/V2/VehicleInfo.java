/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beta.V2;

/**
 *
 * @author adamingah
 */

// One class, no granularity
public class VehicleInfo {
    
    // Static or global...
    
    // Everytime you launch the application, this gets initialized to zero
    private static int SystemIDCounter = 0; /// keep track of how many instances have been created
    private int SystemIDAsInt;
    private String SystemIDAsString;
    
    private static String getNewSystem;
    
    private static int getNewSystemID(){
        // Identify a new /unused SystemID
        SystemIDCounter = 0; // we do not have to reset this everytime...
        boolean Found = false; // whether we have found a free ID
        int index = 0;
        while (Found == false){
            index = 0; // remember to start over looking for a match...
            while (index < SystemIDs.size()){
                // Check to see if the ID is free... looking through all the values
                // in the array list
                
                if (SystemIDCounter == SystemIDs.get(index)){
                    // Match found --> already exists
                    SystemIDCounter++;
                    break;
                    // Or Found == true;
                    
                } else {
                    // we keep looking in the array list
                    index++; 
                }
                
            }
            if (index == SystemIDs.size()){
                // we looped througgh the entire arrayList without finding a match..
                Found = true; // we have found an available ID
                
            } else {
                // We need to keep looking...
            }

        }
        SystemIDs.add(SystemIDCounter);  
        return (SystemIDCounter);
    }
        
    private static java.util.ArrayList<java.lang.Integer> SystemIDs = new java.util.ArrayList<java.lang.Integer>();
    private String VIN;
    private int Year;
    private String Make;
    private String Model;
    private int PassengerCount;
    private String CarType;
    private int LoadCapacity;
    private int DoorCount;
    private int AxleCount;
    private int WingCount;
    private String GasType;
    private VehicleType CurrentVehicleType;
    
    

    public VehicleInfo(String Vin, VehicleType CurrentVehicleType){
        
        // Get a unique system ID
        // leverage a "global" method/ approach
        // Ex: increment the global counter...
        SystemIDCounter++; // every time I get a new object, Increment the ocunt
        this.SystemIDAsInt = SystemIDCounter; // assign the count
        
        
        
        // this.SystemIDAsString = "AL" + SystemIDCounter;
        
        this.SystemIDAsInt = getNewSystemID();
        SystemIDs.add(this.SystemIDAsInt); // add the newly reserved ID to the array list
        
    
    }
    
    public String toString(){
        String output = "";
        
        if ( CurrentVehicleType == VehicleType.Gas){
            
        
        } else if ( CurrentVehicleType == VehicleType.MotorCycle){
        
        
        } else if ( CurrentVehicleType == VehicleType.Passenger){
        
        }
        
 
    
        return(output);
    }
    
    
    /**
     * 
     * @return the VIN
     */
    public String getVIN() {
        return VIN;
    }

    /**
     * @return the Year
     */
    public int getYear() {
        return Year;
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(int Year) {
        this.Year = Year;
    }

    /**
     * @return the Make
     */
    public String getMake() {
        return Make;
    }

    /**
     * @param Make the Make to set
     */
    public void setMake(String Make) {
        this.Make = Make;
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return Model;
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * @return the PassengerCount
     */
    public int getPassengerCount() {
        return PassengerCount;
    }

    /**
     * @param PassengerCount the PassengerCount to set
     */
    public void setPassengerCount(int PassengerCount) {
        this.PassengerCount = PassengerCount;
    }
    
}

enum VehicleType {

    Winged,
    Gas,
    Rotor,
    Passenger,
    MotorCycle,
    Truck,
    
}