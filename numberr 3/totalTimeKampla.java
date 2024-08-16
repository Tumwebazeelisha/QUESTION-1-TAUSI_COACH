/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eli.mavenproject1;

/**
 *
 * @author elisha
 */
public class totalTimeKampla {
     public static void main(String[] args) {
        int totalDistance = 10000;
        int speed = 250; 
        int stopTimeMinutes = 5; 
        
        
        double travelTimeHours = (double) totalDistance / speed;
        
        
        int passengerStopInterval = 150;
        int refuelStopInterval = 200;
        int passengerStops = totalDistance / passengerStopInterval;
        int refuelStops = totalDistance / refuelStopInterval;
        int totalStops = passengerStops + refuelStops;
        int overlapStops = totalDistance / (passengerStopInterval * refuelStopInterval);
        totalStops -= overlapStops;
        if (totalDistance % passengerStopInterval == 0) {
            totalStops--;
        }
       
        double stopTimeHours = (totalStops * stopTimeMinutes) / 60.0;
        double totalTimeHours = travelTimeHours + stopTimeHours;
        
        System.out.println("Total time taken including stops: " + totalTimeHours + " hours");
    }
}

