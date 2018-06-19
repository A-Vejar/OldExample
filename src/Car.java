// Shows an initial error because its not implement the abstract method from "Vehicle" --> "repairCost()"
public class Car extends Vehicle { // --> Inherits attributes from class "Vehicle"

    // Attributes
    private int mileage;
    private int pondCapacity;

    //Constructor
    public Car(String patent, String brand, int year, int mileage, int pondCapacity){
        super(patent, brand, year);
        this.mileage = mileage;
        this.pondCapacity = pondCapacity;
    }

    // Gets
    public int getMileage(){
        return mileage;
    }
    public int getPondCapacity(){
        return pondCapacity;
    }

    // Abstract method from "Vehicle" that return the price for the car's repair
    public int repairCost(){
        return(pondCapacity * 20000);
    }
}
