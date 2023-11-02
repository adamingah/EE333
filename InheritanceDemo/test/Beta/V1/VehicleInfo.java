/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beta.V1;

/**
 *
 * @author adamingah
 */
public class VehicleInfo {
    
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
    
    public VehicleInfo(String Info){
        
        this(); // Calls parameterless constructor
        
        this.VIN = VIN; // set specific fields
        
        
        // Makes the redundant code unnecessary...
        // this.year = 1900;
        // this.Make = "";
        // this.Model = "";
        
    }
    
    public VehicleInfo(String VIN, int year, String Make, String Model){
    
    
        this(VIN);
        this.Year = Year;
        this.Make = Make;
        this.Model = Model;
               
        
    }

    /**
     * @return the VIN
     */
    public String getVIN() {
        return (this.VIN);
    }

    /**
     * @return the Year
     */
    public int getYear() {
        return (this.Year);
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
        return (this.Make);
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
        return (this.Model);
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
        return (this.PassengerCount);
    }

    /**
     * @param PassengerCount the PassengerCount to set
     */
    public void setPassengerCount(int PassengerCount) {
        this.PassengerCount = PassengerCount;
    }
    
    @Override
    public String toString(){
    
        String output = "";
        output += "ClassName: " + this.getClass().toString();
        output += "VIN: " + this.VIN + '\n';
        output += "Year: " + this.Year + '\n';
        output += "Make: " + this.Make + '\n';
        output += "Model: " + this.Model + '\n';
        output += "PassengerCount: " + this.PassengerCount + '\n';
        
        // TO DO: add the rest of the fields
        
        return(output);
        
        
    }
    
    public static VehicleInfo fromCustom(String Input){
    
        // Change the value, don't use null. finish this factory function
        return(null);
    }
    
}
