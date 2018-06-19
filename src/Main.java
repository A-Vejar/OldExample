import java.util.*;

public class Main {

    // Keyboard input data
    static Scanner input = new Scanner(System.in);

    public static void Menu(SystemOperations systemOperations){

        // We call the "InitialMain" class so that its methods can be visible
        InitialMain initialMain = new InitialMain();
        // First method of the "InitialMain" class
        initialMain.MENU();

        System.out.print("Choose an option --> ");
        int choose = input.nextInt();

        // While the number to give isn't be 6, it will be a loop
        while(choose != 6){
            switch(choose){
                // 1. We want to add a vehicle
                case 1:
                    boolean addVehicle = initialMain.addVehiclesData(systemOperations);
                    break;
                // 2. We want to search a patent
                case 2:
                    try {
                        System.out.print("Type the patent: ");
                        String patent = input.next();
                        Vehicle vehicle = systemOperations.obtainVehicle(patent);
                        // Shows all the information from that patent given (If exist)
                        initialMain.vehiclePatentData(vehicle);
                    }catch(IllegalArgumentException e){
                        // If not exist that patent, shows an error message
                        System.out.println(e.getMessage());
                    }
                    break;
                // We want knows all the vehicles registered
                case 3:
                    ListVehicle listVehicle = systemOperations.getAllVehicles();
                    initialMain.vehicleData(listVehicle);
                    break;
                // We want knows the amount of vehicles registered (All, cars and trucks)
                case 4:
                    int total = systemOperations.getVehicles();
                    System.out.println("Total Amount of vehicles: " + total);
                    int cars = systemOperations.getCars();
                    System.out.println("--> Cars: " + cars);
                    int trucks = systemOperations.getTrucks();
                    System.out.println("--> Trucks: " + trucks);
                    break;
                // We want to know which truck has the higher capacity
                case 5:
                    Truck truck = systemOperations.getMoreCapacity();
                    // If exist shows the detail of that truck
                    if(truck != null){
                        initialMain.truckData(truck);
                    }
                    break;
            }

            initialMain.MENU();
            System.out.print("Choose an option --> ");
            choose = input.nextInt();
        }
    }

    public static void main(String[] args) {
        // It calls the "Controller" class where each method given from the class "SystemOperations" is solved
        SystemOperations systemOperations = new Controller();
        // Calls the "Menu" method
        Menu(systemOperations);
    }
}
