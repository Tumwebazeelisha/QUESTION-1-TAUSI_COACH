/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eli.mavenproject1;

/**
 *
 * @author elisha
 */
public class totalTimeKabale {
    public static void main(String[] args) {
        int totalDistance = 10000; 
        int speed = 250; 
        int refuelStopInterval = 200; 
        int stopTimeMinutes = 5; 
        double travelTimeHours = (double) totalDistance / speed;
        int refuelStops = totalDistance / refuelStopInterval;
        if (totalDistance % refuelStopInterval == 0) {
            refuelStops--; 
        }
        double stopTimeHours = (refuelStops * stopTimeMinutes) / 60.0;
        double totalTimeHours = travelTimeHours + stopTimeHours;
        
        System.out.println("Total time taken for the return journey including stops: " + totalTimeHours + " hours");
    }
}
