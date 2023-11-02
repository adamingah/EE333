/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Production;

/**
 *
 * @author adamingah
 */

// Prevents an instance of a class being generated
public abstract class LandVehicleInfo extends VehicleInfo {
    
    // private String TractiveType;
    private TractiveTypeEnum TractiveType;
    private int TractiveCount;
            
    
    public LandVehicleInfo( String VIN){
    
    
        super(VIN); // am calling VehicleInfo(String VIN);
        this.TractiveType = TractiveTypeEnum.unknown;
        this.TractiveCount = 0;
        
    }
    
    public LandVehicleInfo(String VIN, TractiveTypeEnum TractiveTypeEnum, int TractiveCount){
    
        this(VIN);
      //  super(VIN,0,"","");
      
      //TODO: Validate:
      this.TractiveType = TractiveType;
      this.TractiveCount = TractiveCount;
    }
    
    public LandVehicleInfo(String VIN, int Year, String Make, String Model){
       // this(VIN); // Calls LandVehicleInfo(String VIN)
        super(VIN, Year, Make, Model);
        
        
    }

    /**
     * @return the TractiveType
     */
    public TractiveTypeEnum getTractiveType() {
        return TractiveType;
    }

    /**
     * @param TractiveType the TractiveType to set
     */
    public void setTractiveType(TractiveTypeEnum TractiveType) {
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
        output = this.getClass().toString();
        return(output);
        
    
    
    }
    
    
    public String toCustom(){
        String output = "";
        output += super.toCustom(); 
        // add the additional fields.
        return (output);
    
    }
    
}

enum TractiveTypeEnum{

    wheeled,
    tracked,
    skidded,
    unknown
    
   
}

// Final - No one can inherit from this class
// Requires that this class be extended to be useful
//final class PassengerVehicleInfo extends LandVehicleInfo{
//
//    
//}

final class PassengerVehicleInfo extends LandVehicleInfo {
    private int DoorCount;
    private String CarType;
    private PassengerVehicleEnum PassengerVehicleType;

    
    public PassengerVehicleInfo(String VIN){
        super(VIN);
        this.DoorCount = 0;
        this.PassengerVehicleType = PassengerVehicleEnum.unknown;
    
    }
    
    public PassengerVehicleInfo( String VIN, int Year, String Make, String Model){
        //this(VIN);
        super(VIN, Year, Make, Model);
        this.DoorCount = 0;
        this.PassengerVehicleType = PassengerVehicleEnum.unknown;
    
    }
     
    public int getDoorCount(){
        return(this.DoorCount);
    
    }
    
    public void setDoorCount( int DoorCount ){
        this.DoorCount = DoorCount;
    
    
    }
    
    @Override
    public String toString(){
        String output = "";
        output = this.getClass().toString(); // Reflection
        return( output);        
    
    }
    
    @Override
    public String toCustom(){
        String output = "";
        output = super.toCustom();
        output += "DoorCount: " + this.DoorCount;
        return(output);
    
    }
    
    enum PassengerVehicleEnum{
        sedan,
        wagon, 
        coupe,
        unknown // other
    
    }

}

final class MotorCycleVehicleInfo extends LandVehicleInfo{
    private int DoorCount;
    //private String CarType;
    
    public MotorCycleVehicleInfo( String VIN ){
    
        super(VIN);
        
    }
    
   

}

final class LightTruckVehicleInfo extends LandVehicleInfo{
    private int DoorCount;
    private String CarType;
    
    public LightTruckVehicleInfo(String VIN){
        
        super(VIN);
    
    }

}


// Cannot inherrit from a final class
//class SideBySideVehicleInfo extends PassengerVehicleInfo {}