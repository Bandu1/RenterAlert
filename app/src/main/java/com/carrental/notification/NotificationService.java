package com.carrental.notification;
import com.carrental.model.RentalAgreement;
public interface NotificationService {
    void notifyRentalCompany(RentalAgreement rentalAgreement, double currentSpeed);

}
