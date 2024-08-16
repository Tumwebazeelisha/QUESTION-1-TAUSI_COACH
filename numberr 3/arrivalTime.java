/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eli.mavenproject1;

/**
 *
 * @author elisha
 */
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
public class arrivalTime {
    public static void main(String[] args) {
        double distanceKm=10000; 
        double speedMps = 225.5; 
        LocalTime departureTime=LocalTime.of(9, 0); 
       double distanceMeters= distanceKm * 1000; 
      double travelTimeSeconds=distanceMeters / speedMps;
       long travelTimeMinutes =(long)(travelTimeSeconds / 60);
      LocalTime arrivalTime=departureTime.plus(travelTimeMinutes, ChronoUnit.MINUTES);
         System.out.println("Arrival time: " + arrivalTime);
    }
}

