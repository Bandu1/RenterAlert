package com.carrental.model;
public class Car {
    private String id;
    private String model;
    private String registrationNumber;
    private double maxSpeedLimit;
    public Car(String id, String model, String registrationNumber, double maxSpeedLimit) {
        this.id = id;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.maxSpeedLimit = maxSpeedLimit;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getMaxSpeedLimit() {
        return maxSpeedLimit;
    }

    public void setMaxSpeedLimit(double maxSpeedLimit) {
        this.maxSpeedLimit = maxSpeedLimit;
    }

}
