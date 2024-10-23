package Week6.Homework1.Problem2_Bowers;

// concrete implementation of DroneFactory that creates drones for Manufacturer A
public class ManufacturerADrone implements DroneFactory {
    // create the drones with custom values and specialties according to manufacturer
    @Override
    public Drone createSurveillanceDrone() {
        return new SurveillanceDrone(4000, 100, "High-Quality Camera, Night Vision");
    }

    @Override
    public Drone createDeliveryDrone() {
        return new DeliveryDrone(3000, 100, "Payload Capacity");
    }

    @Override
    public Drone createAgriculturalDrone() {
        return new AgriculturalDrone(2000, 150, "Monitoring Irrigation");
    }
}
