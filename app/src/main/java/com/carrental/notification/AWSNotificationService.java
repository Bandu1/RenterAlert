package com.carrental.notification;
import com.carrental.model.RentalAgreement;
public class AWSNotificationService implements NotificationService{
    @Override
    public void notifyRentalCompany(RentalAgreement rentalAgreement, double currentSpeed) {
        // TODO: Call AWS SNS or another AWS service to send a notification to the rental company
        // Example code might look like this:
        // AmazonSNSClient snsClient = new AmazonSNSClient();
        // PublishRequest publishRequest = new PublishRequest(topicArn, message);
        // snsClient.publish(publishRequest);
        System.out.println("Notification sent to rental company via AWS: Car "
                + rentalAgreement.getCar().getRegistrationNumber()
                + " exceeded speed limit at " + currentSpeed + " km/h");
    }
}