/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Production;

/**
 *
 * @author adamingah
 */

// Abstract - no implementations of a vehicle can be created
public abstract class VehicleInfo {
    
    // Look at the idea of 
    // public - class, subclass, package, world (everybody)
    // protected - class, subclass, package, NOT the world
    
    
    private String VIN;
    private int Year;
    private String Make;
    private String Model;
    private int PassengerCount;
    
    public VehicleInfo(){ 
    
        this.VIN = "";
        this.Year = 1900;
        this.Make = "";
        this.Model = "";
        this.PassengerCount = 0;
    }
        
    public VehicleInfo( String VIN ){
    
        this(); // calls the private parameterless constructor
        this.VIN = VIN;
        
    }
    
    public VehicleInfo( String VIN, int Year, String Make, String Model){
        // Needs validation
        this(VIN);
        this.Year = Year;
        this.Make = Make;
        this.Model = Model;
    
    
    }

    /**
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
    
    public String toString(){
        String output = "";
        output = this.getClass().toString();
      //  output = this.getMake().to
        return(output);
        
    }
    
    public String toCustom(){
        String output = "";
        
        // Parsing through a field...
        // Field: value
        
        output += "VIN: " + this.VIN + '\n';
        return(output);
        
    }
    
    
}
