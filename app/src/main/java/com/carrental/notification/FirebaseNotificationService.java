package com.carrental.notification;
import com.carrental.model.RentalAgreement;

public class FirebaseNotificationService implements NotificationService {

    @Override
    public void notifyRentalCompany(RentalAgreement rentalAgreement, double currentSpeed) {
        // Use Firebase API to send notification
        // Example:
        // FirebaseMessaging.getInstance().send(...)
        System.out.println("Notification sent to rental company: Car "
                + rentalAgreement.getCar().getRegistrationNumber()
                + " exceeded speed limit at " + currentSpeed + " km/h");
    }

}