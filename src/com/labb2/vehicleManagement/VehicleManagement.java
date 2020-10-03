package com.labb2.vehicleManagement;

import java.util.ArrayList;

public class VehicleManagement {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("vehicle is added");

    }

    public static void addCar(Car car) {
        vehicles.add(car);
        System.out.println("Car is added");
    }

    public static void addBus(Bus bus) {
        vehicles.add(bus);
        System.out.println("bus is added");
    }

    public static void addTruck(Truck truck) {
        vehicles.add(truck);
        System.out.println("Truck is added");
    }

    public static void showAllVehicles() {
        for (Vehicle v : vehicles)
            System.out.println(v);
    }

    public static void showCars() {
        for (Vehicle v : vehicles) {
            if (v instanceof Car) {
                System.out.println(v);
            }
        }
    }

    public static void removeVehicle(String regNum) {
        for (int i = vehicles.size() - 1; i >= 0; i--) {
            if (vehicles.get(i).getRegNum().equalsIgnoreCase(regNum))
                vehicles.remove(i);
        }
    }

    public static void updateBusComfortLevel(String regNum, int stars) {
        for (Vehicle v : vehicles) {
            if (v.getRegNum().equalsIgnoreCase(regNum)) {
                if (v instanceof Bus) {
                    ((Bus) v).setComfortLevel(stars);
                }
            }
        }
    }

    public static void showByRegNum(String regNum) {
        for (Vehicle v : vehicles)
            if (v.getRegNum().equalsIgnoreCase(regNum)) {
                System.out.println(v);
            }
    }

    public static void stateOfVehicle(String regNum, int num1) {
        int num = num1;

        for (Vehicle v : vehicles)
            if (v.getRegNum().equalsIgnoreCase(regNum)) {
                if (num == 1)
                    System.out.println("vehicle " + v.getRegNum() + " starting");

                else if (num > 1 && num < v.getMaxSpeed())
                    System.out.println("vehicle " + v.getRegNum() + " is moving");

                else if (num == 0)
                    System.out.println("vehicle " + v.getRegNum() + "is stationary");
                else if (num > v.getMaxSpeed()) {
                    System.out.println("vehicle " + v.getRegNum() + " is out of control * # * # * #");
                } else
                    System.out.println("vehicle " + v.getRegNum() + " is not working");
            }
    }

    public static void fastestVehicleList() {
        vehicles.sort((v1, v2) -> v2.getMaxSpeed() - v1.getMaxSpeed());
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    public static void latest() {
        for (Vehicle v : vehicles) {
            if (v.getYearModel() > 2015) {
                System.out.println(v);
            }
        }
    }

    public static void showComfortableBuses() {
        for (Vehicle v : vehicles)
            if (v instanceof Bus) {
                if (((Bus) v).getComfortLevel() >= 4) {
                    System.out.println("Most comfortable buses  : regNum :" + (v.getRegNum() + " " + "brand :" + v.getBrand()));
                    System.out.println("Number of Stars : " + ((Bus) v).getComfortLevel());
                } else
                    System.out.println("Sorry our comfortable buses are in their way");
            }

    }

    public static void updateTruckLoadCapacity(String regNum, int load) {
        for (Vehicle v : vehicles) {
            if (v instanceof Truck) {
                if (((Truck) v).getRegNum().equalsIgnoreCase(regNum)) {
                    ((Truck) v).setMaxLoad(load);
                }
            }
        }
    }

    public static void showCarByModel(int modelYear) {
        for (Vehicle v : vehicles)
            if (v instanceof Car) {
                if (v.getYearModel() == modelYear)
                    System.out.println(v);
                else
                    System.out.println("we do not have " + modelYear + " model");
            }

    }

}

