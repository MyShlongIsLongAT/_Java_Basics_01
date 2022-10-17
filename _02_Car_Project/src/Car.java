public class Car {
    private String serialNumber;
    private String manufacturer;
    private String color;
    private String model;
    private Engine engine;
    private Tank tank;

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

    public void getRemainingRange() {
        int remainingRange = this.tank.getCurrentFuel() / this.engine.getFuelConsumption() * 100;
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
