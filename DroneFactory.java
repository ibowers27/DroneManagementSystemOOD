package Week6.Homework1.Problem2_Bowers;

/** Factory Pattern: Helps create different types of drones. Each drone type (Surveillance, Delivery, Agricultural)
 *  will have its own factory that produces drones with specifications based on the manufacturer.
 */
public interface DroneFactory {
    // drone creation
    Drone createSurveillanceDrone();
    Drone createDeliveryDrone();
    Drone createAgriculturalDrone();
}
