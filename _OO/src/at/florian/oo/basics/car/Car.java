package at.florian.oo.basics.car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String serialNumber;
    private String manufacturer;
    private String color;
    private String model;
    private Engine engine;
    private Tank tank;
    private List<RearMirror> rearMirrors;
    private List<Tire> tires;

    public void breaking() {
        System.out.println("I'm breaking");
    }

    public void turboBoost() {
        if (this.tank.getCurrentFuel() >= (this.tank.getTankVolume() / 10)) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("not enough fuel to go to super-boost");
        }
    }

    public void honk(int amountOfRepetition) {
        for (int i = 0; i < amountOfRepetition; i++) {
            System.out.println("Tuuut");
        }
    }

    public void driving(int time, int velocity) {
        System.out.println(this.tank.getCurrentFuel());
        System.out.println("I am driving and consuming " + this.engine.getType());
        int distance = velocity * time;
        int consumed = this.engine.getFuelConsumption() * distance / 100;
        this.tank.setCurrentFuel(this.tank.getCurrentFuel() - consumed);
        System.out.println(this.tank.getCurrentFuel());

    }

    public void refueling(int liters) {
        this.tank.setCurrentFuel(this.tank.getCurrentFuel() + liters);
    }

    public void getRemainingRange() {
        double remainingRange = this.tank.getCurrentFuel() / this.engine.getFuelConsumption() * 100;
        System.out.println("You will get " + remainingRange + "km but you need to refuel before");
    }

    public void getInfo() {
        System.out.println("Hello this car is manufactured by " + this.manufacturer + " and has " + this.engine.getHorsePower() + " HP");
    }

    public Car(String serialNumber, String manufacturer, String color, String model, Engine engine, Tank tank) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.tank = tank;
        this.rearMirrors = new ArrayList<RearMirror>();
        this.tires = new ArrayList<Tire>();
    }

    public List<Tire> getTires() {
        return this.tires;
    }

    public void addTires(Tire tire) {
        this.tires.add(tire);
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public List<RearMirror> getRearMirrors() {
        return rearMirrors;
    }

    public void addRearMirrors(RearMirror rearMirrors) {
        this.rearMirrors.add(rearMirrors);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
