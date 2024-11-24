package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLiter, int cylinders) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return "Gas Powered Car Engine is started.";
    }

    @Override
    public String drive() {
        super.runEngine(this);
        return "Gas Powered Car is ready to drive.";
    }
}
