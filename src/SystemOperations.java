public interface SystemOperations {

    // All methods (Is not necessary added the initial "public")

    // Aggregate vehicles method
    boolean addVehicle(Vehicle vehicle);

    // Its will shows all the vehicles that were added
    ListVehicle getAllVehicles();

    // Searching vehicles method by its patent
    Vehicle obtainVehicle(String patent);

    // It shows the total number of cars added
    int getCars();

    // It shows the total number of trucks added
    int getTrucks();

    // It show the total number of vehicles added (Cars and trunks)
    int getVehicles();

    // It will show between trucks which one has the most capacity
    Truck getMoreCapacity();
}
