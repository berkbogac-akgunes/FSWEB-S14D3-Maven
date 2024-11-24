package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {

    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        return "Engine is started.";
    }

    public String drive() {
        runEngine(this);
        return "Ready to drive.";
    }

    protected void runEngine(CarSkeleton carSkeleton) {

        if (carSkeleton instanceof GasPoweredCar) {
            double avgKmPerCharge = ((GasPoweredCar)carSkeleton).getAverageKmPerLiter();
            int cylinders = ((GasPoweredCar)carSkeleton).getCylinders();
            System.out.println("Gas Powered Car Engine started. " + "Average Km Per Charge: " + avgKmPerCharge + " Cylinders: " + cylinders);
        } else if (carSkeleton instanceof HybridCar) {
            double avgKmPerCharge = ((HybridCar)carSkeleton).getAvgKmPerLiter();
            double batterySize = ((HybridCar)carSkeleton).getBatterySize();
            int cylinders = ((HybridCar)carSkeleton).getCylinders();
            System.out.println("Hybrid Car Engine started. " + "Average Km Per Charge: " + avgKmPerCharge + "Cylinders: " + cylinders + " Battery Size: " + batterySize);
        } else if (carSkeleton instanceof ElectricCar) {
            double avgKmPerCharge = ((ElectricCar)carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar)carSkeleton).getBatterySize();
            System.out.println("Electric Car Engine started. " + "Average Km Per Charge: " + avgKmPerCharge + " Battery Size: " + batterySize);
        } else {
            System.out.println("Invalid car type!");
        }
    }
}
