package Week6.Homework1.Problem2_Bowers;

public class Main {
    public static void main(String[] args) {
        // create a new drone management system we can add drone manufacturer detail to
        DroneManagement droneManager = new DroneManagement();

        // create each type of drone through Manufacturer A
        droneManager.setManufacturerFactory(new ManufacturerAFactory());

        Drone surveillanceDrone = droneManager.createSurveillanceDrone();
        System.out.println("Manufacturer A Created Drone Type: " + surveillanceDrone.getType());
        System.out.println("Battery Capacity: " + surveillanceDrone.getBatteryCapacity());
        System.out.println("Flight Range: " + surveillanceDrone.getFlightRange());
        System.out.println("Special Features: " + surveillanceDrone.getSpecialFeatures());

        System.out.println("----------");

        Drone deliveryDrone = droneManager.createDeliveryDrone();
        System.out.println("Manufacturer A Created Drone Type: " + deliveryDrone.getType());
        System.out.println("Battery Capacity: " + deliveryDrone.getBatteryCapacity());
        System.out.println("Flight Range: " + deliveryDrone.getFlightRange());
        System.out.println("Special Features: " + deliveryDrone.getSpecialFeatures());

        System.out.println("----------");

        Drone agriculturalDrone = droneManager.createAgriculturalDrone();
        System.out.println("Manufacturer A Created Drone Type: " + agriculturalDrone.getType());
        System.out.println("Battery Capacity: " + agriculturalDrone.getBatteryCapacity());
        System.out.println("Flight Range: " + agriculturalDrone.getFlightRange());
        System.out.println("Special Features: " + agriculturalDrone.getSpecialFeatures());

        System.out.println("----------");

        // change to manufacturer B
        droneManager.setManufacturerFactory(new ManufacturerBFactory());

        Drone surveillanceDroneB = droneManager.createSurveillanceDrone();
        System.out.println("Manufacturer B Created Drone Type: " + surveillanceDroneB.getType());
        System.out.println("Battery Capacity: " + surveillanceDroneB.getBatteryCapacity());
        System.out.println("Flight Range: " + surveillanceDroneB.getFlightRange());
        System.out.println("Special Features: " + surveillanceDroneB.getSpecialFeatures());

        System.out.println("----------");

        Drone deliveryDroneB = droneManager.createDeliveryDrone();
        System.out.println("Manufacturer B Created Drone Type: " + deliveryDroneB.getType());
        System.out.println("Battery Capacity: " + deliveryDroneB.getBatteryCapacity());
        System.out.println("Flight Range: " + deliveryDroneB.getFlightRange());
        System.out.println("Special Features: " + deliveryDroneB.getSpecialFeatures());

        System.out.println("----------");

        Drone agriculturalDroneB = droneManager.createAgriculturalDrone();
        System.out.println("Manufacturer B Created Drone Type: " + agriculturalDroneB.getType());
        System.out.println("Battery Capacity: " + agriculturalDroneB.getBatteryCapacity());
        System.out.println("Flight Range: " + agriculturalDroneB.getFlightRange());
        System.out.println("Special Features: " + agriculturalDroneB.getSpecialFeatures());

    }
}
