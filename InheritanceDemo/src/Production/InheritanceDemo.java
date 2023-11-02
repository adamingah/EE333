/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Production;

import java.util.ArrayList;



/**
 *
 * @author adamingah
 */
public class InheritanceDemo {
    
    public static void main(String[] args){
    
        int index;
        index = 0;
        System.out.println("Count:" + args.length);
        
        for(index = 0; index < args.length; index++){
        
            System.out.println("args[ " + index + " ] = " + args[index] );
            
            
        }
        
        if ((args.length == 1) && (args[0].equalsIgnoreCase("/Demo") == true)){
            
            
        } else if((args.length == 1) && (args[0].equalsIgnoreCase("/V3") == true)) {
            Production.VehicleInfo VehicleA;
            Production.LandVehicleInfo VehicleB;
            Production.PassengerVehicleInfo VehicleC;
           // VehicleA = new Production.VehicleInfo("ID0001");
            
           // VehicleB = new Beta.V3.LandVehicleInfo("");
            // VehicleC = new PassengerVehicleInfo();
        
        } else {
            //Beta.V3.LandVehicleInfo.
        
        }
        
    }
    
    public static void beta(){
        
//    Production.VehicleInfo VehicleA;
//    Production.LandVehicleInfo VehicleB;
//    Production.PassengerVehicleInfo VehicleC;
//    Production.PassengerVehicleInfo VehicleD;
//
//    // vehicleA = new VehicleInfo("ID001"); // abstract class --> can not create an instance
//    // vehicleB = new LandVehicleINfo("ID001"); // abstract class __> can not create an instance
//
//    VehicleC = new PassengerVehicleInfo("ID001");
//    VehicleC.setYear(1984);
//    VehicleC.setMake("Mercedes");
//    VehicleC.setModel("CarModelXYZ");
//
//    VehicleD = new PassengerVehicleInfo("ID002", 1990, "Honda", "Civic");
//    VehicleA = (Production.VehicleInfo) VehicleD;// PassengerVehicle __> vehicle
//    VehicleB = (Production.LandVehicleInfo) VehicleD; // PassengerVehicle --> vehicle
//
//    System.out.println("=======================");
//    System.out.println(VehicleA.toString());
//    System.out.println(VehicleA.toCustom());
//    System.out.println("=======================");
//    System.out.println("=======================");
//    System.out.println(VehicleB.toString());
//    System.out.println(VehicleB.toCustom());
//    System.out.println("=======================");
//    System.out.println("=======================");
//    System.out.println(VehicleC.toString());
//    System.out.println(VehicleC.toCustom());
//    System.out.println("=======================");
//    System.out.println("=======================");
//    System.out.println(VehicleD.toString());
//    System.out.println(VehicleD.toCustom());
//    System.out.println("=======================");
//    System.out.println("");


        
        
        
       
    }
    public static void betav2(){
        java.util.ArrayList<VehicleInfo> Vehicles  = new ArrayList<VehicleInfo>();
        java.util.ArrayList<LandVehicleInfo> LandVehicles  = new ArrayList<LandVehicleInfo>();
        java.util.ArrayList<PassengerVehicleInfo> PassengerVehicles  = new ArrayList<PassengerVehicleInfo>();
        
//        PassengerVehicleInfo VehicleC = new PassengerVehicleInfo( "ID002", 1990, "Honda", "Civic");
//        Vehicles.add(VehicleC);
//        LandVehicles.add(VehicleC);
//        
    
    }
    
}
