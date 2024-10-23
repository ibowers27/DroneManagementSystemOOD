package Week6.Homework1.Problem2_Bowers;

/**
 * Abstract Factory Pattern: We use this to abstract the creation of drones by different manufacturers. Each
 * manufacturer will implement a factory to produce specific drone types with their own specifications.
 * This interface creates drone factories according to manufacturer.
 */
public interface ManufacturerFactory {
    DroneFactory createDroneFactory();
}
