package com.carrental.service;
import com.carrental.model.RentalAgreement;
import com.carrental.notification.NotificationService;
public class SpeedMonitorServiceImpl implements SpeedMonitorService{
    private NotificationService notificationService;
    public SpeedMonitorServiceImpl(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    @Override
    public void monitorSpeed(RentalAgreement rentalAgreement, double currentSpeed) {
        if (currentSpeed > rentalAgreement.getMaxSpeedLimit()) {
            // Notify the rental company via the selected notification service
            notificationService.notifyRentalCompany(rentalAgreement, currentSpeed);
            // TODO: If desired, you could also log this event to an external logging service
            // Example:
            // ExternalLoggingService.logEvent("Speed limit exceeded", ......);
            // Alert the user (this would likely be through a different mechanism in a real system)
            System.out.println("Warning: You are exceeding the speed limit!");
        }
    }
}