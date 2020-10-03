package com.labb2.vehicleManagement;

public class Car extends PassengerVehicle {
    private String typeOfCar;//min car,subcompact car,compact car,van,suv,family bus;


    public Car() {

    }

    public Car(String regNum, String model, String brand, int maxSpeed, int yearModel, int numSeats, int numOfDoors,
               String typeofGearBox, String typeOfCar) {
        super(regNum, model, brand, maxSpeed, yearModel, numSeats, numOfDoors, typeofGearBox);
        this.typeOfCar = typeOfCar;
    }

    //getter
    public String getTypeOfCar() {
        return typeOfCar;
    }

    //setter
    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car : " + super.toString() + "\t" +
                "typeOfCar='" + typeOfCar;
    }
}
