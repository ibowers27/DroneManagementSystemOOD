package Week6.Homework1.Problem2_Bowers;

// concrete implementation of Drone interface for agricultural drones
public class AgriculturalDrone implements Drone{
    private int batteryCapacity;
    private int flightRange;
    private String specialFeatures;

    // AgriculturalDrone constructor, initializes attributes
    public AgriculturalDrone(int batteryCapacity, int flightRange, String specialFeatures) {
        this.batteryCapacity = batteryCapacity;
        this.flightRange = flightRange;
        this.specialFeatures = specialFeatures;
    }

    // getters for attributes
    @Override
    public String getType() {
        return "Agricultural";
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