package com.carrental.model;
import java.util.Date;
public class RentalAgreement {
    private Renter renter;
    private Car car;

    private double maxSpeedLimit;
    private Date rentalStartTime;
    private Date rentalEndTime;

    public RentalAgreement(Renter renter, Car car, double maxSpeedLimit, Date rentalStartTime, Date rentalEndTime) {
        this.renter = renter;
        this.car = car;
        this.maxSpeedLimit = maxSpeedLimit;
        this.rentalStartTime = rentalStartTime;
        this.rentalEndTime = rentalEndTime;
    }
    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getMaxSpeedLimit() {
        return maxSpeedLimit;
    }

    public void setMaxSpeedLimit(double maxSpeedLimit) {
        this.maxSpeedLimit = maxSpeedLimit;
    }
    public Date getRentalStartTime() {
        return rentalStartTime;
    }
    public void setRentalStartTime(Date rentalStartTime) {
        this.rentalStartTime = rentalStartTime;
    }

    public Date getRentalEndTime() {
        return rentalEndTime;
    }
    public void setRentalEndTime(Date rentalEndTime) {
        this.rentalEndTime = rentalEndTime;
    }
}
