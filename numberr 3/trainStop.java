/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eli.mavenproject1;

/**
 *
 * @author ROBERT
 */
public class trainStop {
    public static void main(String[] args) {
        int totalDistance = 10000; 
        int passengerStopInterval = 150;
        int refuelStopInterval = 200; 
        int passengerStops = totalDistance/passengerStopInterval;
        int refuelStops = totalDistance/refuelStopInterval;
        
        int totalStops = passengerStops+refuelStops;
       int overlapStops = totalDistance/(passengerStopInterval*refuelStopInterval);
        totalStops -= overlapStops;
        
        
        if (totalDistance % passengerStopInterval == 0) {
            totalStops--;
        }
System.out.println("Total number of stops: " + totalStops);
    }
}

