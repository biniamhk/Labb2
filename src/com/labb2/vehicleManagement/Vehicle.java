package com.labb2.vehicleManagement;

public class Vehicle {
    private String regNum;
    private String model;
    private String brand;
    private int maxSpeed;
    private int yearModel;


    public Vehicle() {
    }

    public Vehicle(String regNum, String model, String brand, int maxSpeed, int yearModel) {
        this.regNum = regNum;
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.yearModel = yearModel;
    }


    // getters
    public String getRegNum() {
        return regNum;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearModel() {
        return yearModel;
    }

    //setters


    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    //toString methos

    @Override
    public String toString() {
        return  "  model='" + model + '\'' +
                ", brand='" + brand + '\'' +", yearModel=" + yearModel + " "+
                ", maxSpeed=" + maxSpeed + " km/h \t"
                +"regNum=" + regNum ;

    }
}
