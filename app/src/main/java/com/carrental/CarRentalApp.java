package com.carrental;

import com.carrental.model.Car;
import com.carrental.model.RentalAgreement;
import com.carrental.model.Renter;
import com.carrental.notification.FirebaseNotificationService;
import com.carrental.notification.NotificationService;
import com.carrental.service.SpeedMonitorService;
import com.carrental.service.SpeedMonitorServiceImpl;

import java.util.Date;

public class CarRentalApp {
    public static void main(String[] args) {
        NotificationService notificationService = new FirebaseNotificationService();
        SpeedMonitorService speedMonitorService = new SpeedMonitorServiceImpl(notificationService);



      /*  Renter renter = new Renter(...);
        Car car = new Car(...);
        RentalAgreement rentalAgreement = new RentalAgreement(renter, car, car.getMaxSpeedLimit(), ...);
        */

        /*Set the temp static data*/

        // Create a Car instance with example data
        Car car = new Car("C001", "Honda", "AB123CD", 100.0);

        // Create a Renter instance with example data
        Renter renter = new Renter("R001", "ABC", "ABC@example.com");

        // Create a RentalAgreement instance with the Car and Renter
        RentalAgreement rentalAgreement = new RentalAgreement(renter, car, car.getMaxSpeedLimit(), new Date(), null);

        double currentSpeed = 120.0; // Example current speed
        speedMonitorService.monitorSpeed(rentalAgreement, currentSpeed);
    }
}