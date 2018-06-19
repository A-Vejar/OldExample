// Shows an initial error because its not implement the abstract method from "Vehicle" --> "repairCost()"
public class Truck extends Vehicle { // --> Inherits attributes from class "Vehicle"

    // Attributes
    private int capacity;

    // Constructor
    public Truck(String patent, String brand, int year, int capacity){
        super(patent, brand, year);
        this.capacity = capacity;
    }

    // Get
    public int getCapacity(){
        return capacity;
    }

    // Abstract method from "Vehicle" that return the price for the truck's repair
    public int repairCost(){
        return (capacity * 100000);
    }
}
