package Week6.Homework1.Problem2_Bowers;

// this class serves as a centralizes manager for drone creation according to selected manufacturer
public class DroneManagement {
    // reference the manufacturer factory
    private ManufacturerFactory manufacturerFactory;

    // sets the correct manufacturer for drone creation
    public void setManufacturerFactory(ManufacturerFactory manufacturerFactory) {
        this.manufacturerFactory = manufacturerFactory;
    }

    // create drones from specified factories
    public Drone createSurveillanceDrone() {
        DroneFactory factory = manufacturerFactory.createDroneFactory();
        return factory.createSurveillanceDrone();
    }

    public Drone createDeliveryDrone() {
        DroneFactory factory = manufacturerFactory.createDroneFactory();
        return factory.createDeliveryDrone();
    }

    public Drone createAgriculturalDrone() {
        DroneFactory factory = manufacturerFactory.createDroneFactory();
        return factory.createAgriculturalDrone();
    }
}
