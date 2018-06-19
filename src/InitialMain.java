import java.util.*;

public class InitialMain {

    // Keyboard input data
    static Scanner input = new Scanner(System.in);

    // ---------- ALL METHODS ----------

    // 1. MENU
    public static void MENU(){
        System.out.println("--------------- MENU'S CHOICES ---------------");
        System.out.println("1. Add Vehicle\n2. Search Patent (Repair Cost)\n3. Vehicles List\n4. Vehicles Amount\n5. Higher Truck's Capacity\n6. Exit");
    }

    // 2. Shows all the truck information given
    public static void truckData(Truck truck){
        System.out.println("--------------- TRUCK ---------------");
        System.out.println("Patent: " + "|" + truck.getPatent() + "|");
        System.out.println("Brand: " + "|" + truck.getBrand() + "|");
        System.out.println("Year: " + "|" + truck.getYear() + "|");
        System.out.println("Truck's Capacity: " + "|" + truck.getCapacity() + "|");
    }

    // 3. Shows all the car information given
    public static void carData(Car car){
        System.out.println("--------------- CAR ---------------");
        System.out.println("Patent: " + "|" + car.getPatent() + "|");
        System.out.println("Brand: " + "|" + car.getBrand() + "|");
        System.out.println("Year: " + "|" + car.getYear() + "|");
        System.out.println("Car's Mileage: " + "|" + car.getMileage() + "|");
        System.out.println("Car's Pond Capacity: " + "|" + car.getPondCapacity() + "|");
    }

    // 4. Shows a list of all the vehicles (Cars and trucks) information previously given
    public static void vehicleData(ListVehicle listVehicle){
        System.out.println("------------------------- VEHICLES -------------------------");
        // Goes trough all the elements given (Vehicles)
        for(int i = 0; i < listVehicle.getElements(); i++){
            // It will shows vehicle by vehicle only if its in the range or exist
            Vehicle vehicle = listVehicle.getVehicleI(i);
            // If the vehicle its a car, we use a "Cast" to change the vehicle's data and then shows that car
            if(vehicle instanceof Car){
                Car car = (Car) vehicle;
                carData(car);
            }else{
                // Otherwise the vehicle its a truck, so it shows that truck by using a "Cast"
                Truck truck = (Truck) vehicle;
                truckData(truck);
            }
        }
    }

    // 5. Shows the information from a type of vehicle given by their patent (Search patent method)
    public static void vehiclePatentData(Vehicle vehicle){

        System.out.println("Vehicle's Patent: " + "|" + vehicle.getPatent() + "|");
        // If the vehicle its a truck, we use a "Cast" to change the vehicle's data and then shows that truck
        if(vehicle instanceof Truck){
            Truck truck = (Truck) vehicle;
            truckData(truck);
            // Otherwise the vehicle its a car, so it shows that car by using a "Cast"
        }else{
            Car car = (Car) vehicle;
            carData(car);
        }
        System.out.println("Vehicle Repair Cost: $" + vehicle.repairCost());
    }

    // Added method data from vehicles
    public static boolean addVehiclesData(SystemOperations systemOperations){

        // Attributes
        String patent, brand;
        int year, mileage, pondCapacity, capacity;

        System.out.println();
        System.out.print("Choose type of vehicle:\n1. Car\n2. Truck\n---> ");
        int choose = input.nextInt();

        if(choose == 1){
            // As "Vehicle" its a parent class, the others classes will be inherit their attributes
            System.out.println("Car's patent: ");
            patent = input.next();

            System.out.println("Car's brand: ");
            brand = input.next();

            System.out.println("Car's year: ");
            year = input.nextInt();

            System.out.println("Car's mileage: ");
            mileage = input.nextInt();

            System.out.println("Car's pond capacity: ");
            pondCapacity = input.nextInt();

            // We create a "car object" from the "Vehicle" class, as we know the class "Car" inherit from this one
            Vehicle car = new Car(patent, brand, year, mileage, pondCapacity);
            return systemOperations.addVehicle(car);
        }else{
            if(choose == 2){
                System.out.println("Truck's patent: ");
                patent = input.next();

                System.out.println("Truck's brand: ");
                brand = input.next();

                System.out.println("Truck's year: ");
                year = input.nextInt();

                System.out.println("Truck's capacity: ");
                capacity = input.nextInt();

                // We create a "truck object" from the "Vehicle" class because this one is a parent class
                Vehicle truck = new Truck(patent, brand, year, capacity);
                return systemOperations.addVehicle(truck);
            }else{
                return false;
            }
        }
    }
}
