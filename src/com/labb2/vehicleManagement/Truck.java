package com.labb2.vehicleManagement;

public class Truck extends Vehicle {
    private String typeOfTruck;//tanker,tractor,goods truck.
    private int maxLoad;

    public Truck() {

    }

    public Truck(String regNum, String model, String brand, int speed, int yearModel, String typeOfTruck, int maxLoad) {
        super(regNum, model, brand, speed, yearModel);
        this.typeOfTruck = typeOfTruck;
        this.maxLoad = maxLoad;
    }

    //getter
    public String getTypeOfTruck() {
        return typeOfTruck;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    //setter
    public void setTypeOfTruck(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "Truck :" + super.toString() + "\t" +
                "typeOfTruck='" + typeOfTruck + '\'' +
                ", maxLoad=" + maxLoad + " ton";
    }
}
