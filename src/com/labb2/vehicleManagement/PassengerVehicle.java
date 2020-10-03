package com.labb2.vehicleManagement;

public class PassengerVehicle extends Vehicle {
    private int NumSeats;
    private int NumOfDoors;
    private String TypeofGearBox;

    public PassengerVehicle() {

    }

    public PassengerVehicle(String regNum, String model, String brand, int maxSpeed, int yearModel,
                            int numSeats, int numOfDoors, String typeofGearBox) {
        super(regNum, model, brand, maxSpeed, yearModel);
        NumSeats = numSeats;
        NumOfDoors = numOfDoors;
        TypeofGearBox = typeofGearBox;
    }

    //getter
    public int getNumSeats() {
        return NumSeats;
    }

    public int getNumOfDoors() {
        return NumOfDoors;
    }

    public String getTypeofGearBox() {
        return TypeofGearBox;
    }

    //setter
    public void setNumSeats(int numSeats) {
        NumSeats = numSeats;
    }

    public void setNumOfDoors(int numOfDoors) {
        NumOfDoors = numOfDoors;
    }

    public void setTypeofGearBox(String typeofGearBox) {
        TypeofGearBox = typeofGearBox;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" +
                "NumSeats=" + NumSeats +
                ", NumOfDoors=" + NumOfDoors +
                ", TypeofGearBox='" + TypeofGearBox;
    }
}
