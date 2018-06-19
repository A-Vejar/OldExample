public abstract class Vehicle {

    // Attributes
    private String patent;
    private String  brand;
    private int year;

    // Constructor
    protected Vehicle(String patent, String brand, int year){
        this.patent = patent;
        this.brand = brand;
        this.year = year;
    }

    // Gets
    public String getPatent(){
        return this.patent;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getYear(){
        return this.year;
    }

    // Abstract method
    abstract public int repairCost();
}
