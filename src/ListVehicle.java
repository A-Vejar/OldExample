public class ListVehicle {

    // Attributes
    private Vehicle[] vehicles;
    private int max;
    private int elements;

    // Constructor
    public ListVehicle(int max){
        this.max = max;
        elements = 0;
        vehicles = new Vehicle[max];
    }

    // Get method for the all elements that were added
    public int getElements(){
        return elements;
    }

    /**
     * Add vehicles method
     * @param vehicle --> Stored vehicles
     * @return --> true or false
     */
    public boolean addVehicles(Vehicle vehicle){
        if(elements < this.max){
            vehicles[elements] = vehicle;
            elements++;
            return true;
        }else{
            return false;
        }
    }

    /**
     * Search vehicles method
     * @param patent --> It search for an unique patent given
     * @return --> "null" if its not find the patent or "Vehicles[i]" if it found the patent of the vehicle
     */
    public Vehicle searchVehicle(String patent){
        int i;
        // Passes through from the array checking for that patent
        for(i = 0; i < elements; i++){
            // If its found the patent, ends
            if(vehicles[i].getPatent().equals(patent)){
                break;
            }
        }
        // If its reach all elements ...
        if(i == elements){
            // If it doesn't found the patent
            return null;
        }else{
            // Otherwise return that vehicle
            return vehicles[i];
        }
    }

    /**
     *
     * @param i --> It will get in a future method (Class "Controller") the type of vehicles, either by cars or trucks
     * @return --> "null" if isn't exist or "vehicles[i]" if it shows one of this two (Car ot truck) in the range or exist
     */
    public Vehicle getVehicleI(int i){
        if(i >= 0 && i < elements){
            return vehicles[i];
        }
        return null;
    }
}
