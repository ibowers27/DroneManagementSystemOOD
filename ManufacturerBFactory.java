package Week6.Homework1.Problem2_Bowers;

// concrete factory for manufacturer B creating/returning its drone factory
public class ManufacturerBFactory implements ManufacturerFactory {
    @Override
    public DroneFactory createDroneFactory() {
        return new ManufacturerBDrone();
    }
}
