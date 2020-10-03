package com.labb2.vehicleManagement;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadArrayList();

        boolean quit = false;
        int choice;
        printMenu();
        while (!quit) {
            System.out.println("Write your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    addVehicle();
                    break;
                case 2:
                    addCar();
                    break;
                case 3:
                    addBus();
                    break;
                case 4:
                    addTruck();
                    break;
                case 5:
                    showAllVehicles();
                    break;
                case 6:
                    showCars();
                    break;
                case 7:
                    removeByRegNum();
                    break;
                case 8:
                    setBusComfortLevel();
                    break;
                case 9:
                    showByRegNum();
                    break;
                case 10:
                    stateOfVehicle();
                    break;
                case 11:
                    fastestVehicle();
                    break;
                case 12:
                    showComfortableBuses();
                    break;
                case 13:
                    updateTruckLoadCapacity();
                    break;
                case 14:
                    showCarByModel();
                    break;
                case 15:
                    latest();
                    break;
                case 16:
                    quit = true;
                    break;
            }
        }
    }

    private static void loadArrayList() {
        // Vehicle vehicle = new Vehicle("whs123", "v80", "volvo", 190, 2019);

        Car car = new Car("wed123", "v40", "Volvo", 190, 2014,
                6, 5, "automat", "half compact");
        Car car1 = new Car("xyz222", "volkswagen passat", "Volkswagen", 200, 2016,
                6, 5, "manual", "compact");
        Bus bus = new Bus("abc456", "bus9700", "volvo", 140, 2018, 40, 3,
                "manual", "coach bus", 3);
        Bus bus1 = new Bus("efg333", "busF300", "Saab-scania", 160, 2016, 45, 3,
                "automat", "School bus", 3);

        Truck truck = new Truck("xxx456", "Scania s730", "Scania", 120, 2014,
                "goods truck", 30);
        Truck truck1 = new Truck("zzz123", "Mercedes Actors", "Mercedes Benz", 120, 2014,
                "goods truck", 30);

        // VehicleManagement.addVehicle(vehicle);
        VehicleManagement.addCar(car);
        VehicleManagement.addCar(car1);
        VehicleManagement.addBus(bus);
        VehicleManagement.addBus(bus1);
        VehicleManagement.addTruck(truck);
        VehicleManagement.addTruck(truck1);
    }


    private static void printMenu() {
        System.out.println();
        System.out.println("\t Vehicle Management Menu");
        System.out.println("\t--------------------------------");
        System.out.println("\n0. show menu");
        System.out.println("1. Add vehicle");
        System.out.println("2. Add car");
        System.out.println("3. Add bus");
        System.out.println("4. Add truck");
        System.out.println("5. show all vehicles");
        System.out.println("6. show all cars");
        System.out.println("7. delete a vehicle by registration number ");
        System.out.println("8. set comfort level of a bus");
        System.out.println("9. show by regNum");
        System.out.println("10. State of the vehicle ");
        System.out.println("11. show fastest vehicle");
        System.out.println("12. show comfortable buses ");
        System.out.println("13. update truck load capacity");
        System.out.println("14. Show car by speed");
        System.out.println("15: show latest 5 years model vehicle");
        System.out.println("16. quit");
    }

    private static void addVehicle() {
        System.out.print("regNum : ");
        String regNum = scanner.nextLine();

        System.out.print("model : ");
        String model = scanner.nextLine();

        System.out.print("brand : ");
        String brand = scanner.nextLine();

        System.out.print("maxspeed : ");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.print("year model :");
        int yearModel = scanner.nextInt();
        scanner.nextLine();

        Vehicle vehicle = new Vehicle(regNum, model, brand, maxSpeed, yearModel);
        VehicleManagement.addVehicle(vehicle);

    }

    private static void addCar() {

        System.out.print("regNum : ");
        String regNum = scanner.nextLine();


        System.out.print("model : ");
        String model = scanner.nextLine();

        System.out.print("brand : ");
        String brand = scanner.nextLine();

        System.out.print("maxSpeed : ");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.print("year model :");
        int yearModel = scanner.nextInt();
        scanner.nextLine();

        System.out.print("numSeats : ");
        int numSeats = scanner.nextInt();
        scanner.nextLine();

        System.out.print("number of doors :");
        int numOfDoors = scanner.nextInt();
        scanner.nextLine();

        System.out.print("type of gear : ");
        String gear = scanner.nextLine();

        System.out.print("type of car : ");
        String type = scanner.nextLine();

        Car car = new Car(regNum, model, brand, maxSpeed, yearModel, numSeats, numOfDoors, gear, type);
        VehicleManagement.addCar(car);
    }

    private static void addBus() {
        System.out.print("regNum : ");
        String regNum = scanner.nextLine();


        System.out.print("model : ");
        String model = scanner.nextLine();

        System.out.print("brand : ");
        String brand = scanner.nextLine();

        System.out.print("maxspeed : ");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.print("year model :");
        int yearModel = scanner.nextInt();
        scanner.nextLine();

        System.out.print("numSeats : ");
        int numSeats = scanner.nextInt();
        scanner.nextLine();

        System.out.print("number of doors :");
        int numOfDoors = scanner.nextInt();
        scanner.nextLine();

        System.out.print("type of gear : ");
        String gear = scanner.nextLine();


        System.out.print(" type of bus : :");
        String typeOfBus = scanner.nextLine();


        System.out.print("num of stops ");
        int stops = scanner.nextInt();
        scanner.nextLine();

        Bus bus = new Bus(regNum, model, brand, maxSpeed, yearModel, numSeats, numOfDoors, gear, typeOfBus, stops);

        VehicleManagement.addBus(bus);
    }

    private static void addTruck() {
        System.out.print("regNum : ");
        String regNum = scanner.nextLine();


        System.out.print("model : ");
        String model = scanner.nextLine();

        System.out.print("brand : ");
        String brand = scanner.nextLine();

        System.out.print("maxspeed : ");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.print("year model :");
        int yearModel = scanner.nextInt();
        scanner.nextLine();

        System.out.print("type of truck :");
        String type = scanner.nextLine();

        System.out.print("maximum load capacity :");
        int load = scanner.nextInt();
        scanner.nextLine();
        Truck truck = new Truck(regNum, model, brand, maxSpeed, yearModel, type, load);
        VehicleManagement.addTruck(truck);

    }

    private static void showAllVehicles() {
        VehicleManagement.showAllVehicles();
    }

    private static void showCars() {
        VehicleManagement.showCars();
    }


    private static void removeByRegNum() {
        System.out.print("enter regNum of vehicle you want to delete :");
        String regNum = scanner.nextLine();
        VehicleManagement.removeVehicle(regNum);
    }

    private static void updateTruckLoadCapacity() {
        System.out.println("enter registration number of a Truck to update");
        String regNum = scanner.nextLine();
        System.out.println("enter new load");
        int load = scanner.nextInt();
        VehicleManagement.updateTruckLoadCapacity(regNum, load);
    }

    private static void setBusComfortLevel() {
        System.out.print("enter regNum of the bus :");
        String regNum = scanner.nextLine();
        System.out.print("enter comfort level star between 1 and 5 : ");
        int stars = scanner.nextInt();
        scanner.nextLine();
        VehicleManagement.updateBusComfortLevel(regNum, stars);
    }

    private static void showByRegNum() {
        System.out.print("enter regNum : ");
        String regNum = scanner.nextLine();
        VehicleManagement.showByRegNum(regNum);
    }

    private static void stateOfVehicle() {
        Vehicle vehicle = new Vehicle();
        System.out.println("enter regnum :");
        String regNum = scanner.nextLine();

        System.out.println("Enter an integer then you will get state of the vehicle : ");
        int num = scanner.nextInt();
        scanner.nextLine();
        VehicleManagement.stateOfVehicle(regNum, num);
    }

    private static void fastestVehicle() {
        VehicleManagement.fastestVehicleList();
    }

    private static void showComfortableBuses() {
        VehicleManagement.showComfortableBuses();

    }

    private static void showCarByModel() {
        System.out.println("enter model year of a car");
        int modelYear = scanner.nextInt();
        scanner.nextLine();
        VehicleManagement.showCarByModel(modelYear);
    }

    private static void latest() {
        VehicleManagement.latest();
    }

}
