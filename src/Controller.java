public class Controller implements SystemOperations {

    // Attributes
    private ListVehicle listVehicle;

    // Constructor
    public Controller(){
        listVehicle = new ListVehicle(10);
    }

    // All implements methods from the "Interface" class

    @Override
    public boolean addVehicle(Vehicle vehicle) {
        // Go directly to the method created in the class "ListVehicle"
        return listVehicle.addVehicles(vehicle);
    }
    @Override
    public ListVehicle getAllVehicles() {
        // It return all the vehicles which were added
        return listVehicle;
    }
    @Override
    public Vehicle obtainVehicle(String patent) {
        // We created an object from the class "Vehicle" that seeks the patent
        Vehicle vehicle = listVehicle.searchVehicle(patent);
        // If exist, it will show that vehicle
        if(vehicle != null){
            return vehicle;
        }
        // Otherwise if its not found the patent, shows an exception
        throw new IllegalArgumentException("The vehicle's patent has been  not found");
    }
    @Override
    public int getCars() {
        int counter = 0;
        // Goes through all the elements that were given
        for(int i = 0; i < listVehicle.getElements(); i++){
            // Created object from the class "Vehicle" which it will get the type of vehicle if its in the range
            Vehicle vehicle = listVehicle.getVehicleI(i);
            // Check if the vehicle is a car and then the counter grows
            if(vehicle instanceof Car){
                counter++;
            }
        }
        return counter;
    }
    @Override
    public int getTrucks() {
        int counter = 0;
        // Goes through all the elements that were given
        for(int i = 0; i < listVehicle.getElements(); i++){
            // Created object from the class "Vehicle" which it will get the type of vehicle if its in the range
            Vehicle vehicle = listVehicle.getVehicleI(i);
            // Check if the vehicle is a truck and then the counter grows
            if(vehicle instanceof Truck){
                counter++;
            }
        }
        return counter;
    }
    @Override
    public int getVehicles() {
        // Shows all the vehicles given
        return listVehicle.getElements();
    }
    @Override
    public Truck getMoreCapacity() {
        int higher = -1;
        // Empty object created from the class "Truck"
        Truck capacity = null;
        // Goes through all the elements that were given
        for(int i = 0; i < listVehicle.getElements(); i++){
            // Created object from the class "Vehicle" which it will get a type of vehicle if its in the range
            Vehicle vehicle = listVehicle.getVehicleI(i);
            // It will check if the vehicle is a truck
            if(vehicle instanceof Truck){
                // Object created from the class "Truck" where we apply a "Cast" to change the vehicle's data
                Truck truck = (Truck) vehicle;
                // Condition to get the higher truck's capacity one by one
                if(truck.getCapacity() > higher){
                    higher = truck.getCapacity();
                    // We change the "higher" data obtained to the empty object created in the beginning
                    capacity = truck;
                }
            }
        }
        return capacity;
    }
}
