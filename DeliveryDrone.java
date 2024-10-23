package Week6.Homework1.Problem2_Bowers;

// concrete implementation of Drone for delivery drones
public class DeliveryDrone implements Drone {
    private int batteryCapacity;
    private int flightRange;
    private String specialFeatures;

    // DeliveryDrone constructor, initializes attributes
    public DeliveryDrone(int batteryCapacity, int flightRange, String specialFeatures) {
        this.batteryCapacity = batteryCapacity;
        this.flightRange = flightRange;
        this.specialFeatures = specialFeatures;
    }

    // getters for attributes
    @Override
    public String getType() {
        return "Delivery";
    }

    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public int getFlightRange() {
        return flightRange;
    }

    @Override
    public String getSpecialFeatures() {
        return specialFeatures;
    }
}
