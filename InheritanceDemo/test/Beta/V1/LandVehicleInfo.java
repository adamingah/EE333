/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beta.V1;

/**
 *
 * @author adamingah
 */
public class LandVehicleInfo extends VehicleInfo {
    
    private String TractiveType;
    private int TractiveCount;
    
    public LandVehicleInfo(){
    
        super();
        // set the more specific fields
        this.TractiveType = "unknown";
        this.TractiveCount = 0;
        
    }
    
    public LandVehicleInfo( String VIN ){
    
        super(VIN); // we can not set the VIN after construction
        // this(); // we can ONLY call one constructor - which one?
        this.TractiveType = "unknown";
        this.TractiveCount = 0;
    }

    /**
     * @return the TractiveType
     */
    public String getTractiveType() {
        return TractiveType;
    }

    /**
     * @param TractiveType the TractiveType to set
     */
    public void setTractiveType(String TractiveType) {
        this.TractiveType = TractiveType;
    }

    /**
     * @return the TractiveCount
     */
    public int getTractiveCount() {
        return TractiveCount;
    }

    /**
     * @param TractiveCount the TractiveCount to set
     */
    public void setTractiveCount(int TractiveCount) {
        this.TractiveCount = TractiveCount;
    }
    
    public String toString(){
    
        String output = "";
        output += super.toString();
        
        // Alternatives
        output += "VIN: " + this.getVIN() + '\n';
        output += "VIN: " + super.getVIN() + '\n';
        // Do this for each of the fields in our parent class
        // Or rely on the toString from our parent class
        
        output += super.toString();
        // add the specifics for uor child class
        output += "ClassName: " + this.getClass().toString() + '\n';
        output += "TractiveType: " + this.TractiveType + '\n';
        output += "TractiveCount:" + this.TractiveCount + '\n';
        
        
        return (output);
        
    }
    
}

// Create the appropriate constructors and toStrings()
class MotorcycleVehicleInfo extends LandVehicleInfo{
    

}

class Passenger extends LandVehicleInfo{
    // Car type, door

}
class LightTruckVehicleInfo extends LandVehicleInfo{
    
}
class MediumandHeavyTruckVehicleInfo extends LandVehicleInfo{}
