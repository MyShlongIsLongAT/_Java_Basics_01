public class Engine {
    public enum TYPE {diesel, gas}

    ;
    private int horsePower;
    private String model;
    private String manufacturer;
    private TYPE type;

    //TODO change locations of vars from car to engine and car to tank
    private int fuelConsumption;

    private int thrust;

    public Engine(int horsePower, String model, String manufacturer, TYPE type, int fuelConsumption) {
        this.horsePower = horsePower;
        this.model = model;
        this.manufacturer = manufacturer;
        this.type = type;
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getThrust() {
        return thrust;
    }

    public void setThrust(int thrust) {
        this.thrust = thrust;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
