/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beta.V1;

/**
 *
 * @author adamingah
 */
public class AirVehicleInfo extends VehicleInfo {
    
    // Note, we have a private parameterless constructor in our base class
    // we must have a constructor in our child class/inheritance class
    
    private AirVehicleInfo(){
        
        // this. --> allows us to see all the getters and setters, but not the
        // private variabels. We can not set the VIN.
    
        super(); // calls VehicleInfo()
        // set specific fields/defaults
    }
    
    public AirVehicleInfo( String VIN ){
        // Call our parent constructor
        
        super(VIN); // Calls the parent constructor (VehicleInfo( String VIN);
        // set specific fields/defaults

    }
    
}
