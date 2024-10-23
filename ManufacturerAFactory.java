package Week6.Homework1.Problem2_Bowers;

// concrete factory for manufacturer A creating/returning drone factory
public class ManufacturerAFactory implements ManufacturerFactory {
    @Override
    public DroneFactory createDroneFactory() {
        return new ManufacturerADrone();
    }
}
