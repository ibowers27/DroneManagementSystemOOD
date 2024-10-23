package Week6.Homework1.Problem2_Bowers;

// concrete implementation of DroneFactory that creates drones for Manufacturer B
public class ManufacturerBDrone implements DroneFactory {
    // create the drones with custom values and specialties according to manufacturer
    @Override
    public Drone createSurveillanceDrone() {
        return new SurveillanceDrone(5000, 50, "Facial Recognition");
    }

    @Override
    public Drone createDeliveryDrone() {
        return new DeliveryDrone(4000, 50, "Drop-Off Mechanism");
    }

    @Override
    public Drone createAgriculturalDrone() {
        return new AgriculturalDrone(4000, 100, "Spraying Pesticides");
    }
}
