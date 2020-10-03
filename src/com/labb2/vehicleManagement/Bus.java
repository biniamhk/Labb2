package com.labb2.vehicleManagement;

public class Bus extends PassengerVehicle {
    private String typeOfBus;// single deck ,double deck, minibus, school bus,coach bus.
    private int numOfStops;
    private int comfortLevel; //give 1 to 5 stars

    public Bus() {

    }

    public Bus(String regNum, String model, String brand, int speed, int yearModel, int numSeats, int numOfDoors,
               String typeofGearBox, String typeOfBus, int numOfStops) {
        super(regNum, model, brand, speed, yearModel, numSeats, numOfDoors, typeofGearBox);
        this.typeOfBus = typeOfBus;
        this.numOfStops = numOfStops;

    }

    //getter
    public String getTypeOfBus() {
        return typeOfBus;
    }

    public int getNumOfStop() {
        return numOfStops;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    //setter
    public void setTypeOfBus(String typeOfBus) {
        this.typeOfBus = typeOfBus;
    }

    public void setNumOfStop(int stationsToStop) {
        this.numOfStops = stationsToStop;
    }

    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    @Override
    public String toString() {
        return "Bus : " + super.toString() + "\t" +
                "typeOfBus='" + typeOfBus + '\'' +
                ", numOfStops=" + numOfStops;
    }
}
