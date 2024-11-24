package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        System.out.println("***************************");

        CarSkeleton carSkeleton = new CarSkeleton("Car Skeleton", "First Car Skeleton");

        CarSkeleton electricCar = new ElectricCar("Electric Car", "First Electric Car", 300, 8);
        CarSkeleton gasPoweredCar = new GasPoweredCar("Gas Powered Car", "First Gas Powered Car", 12, 4);
        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "First Hybrid Car", 10, 80, 4);

        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());

        //System.out.println(gasPoweredCar.startEngine());
        //System.out.println(gasPoweredCar.drive());

        //System.out.println(hybridCar.startEngine());
        //System.out.println(hybridCar.drive());
    }
}