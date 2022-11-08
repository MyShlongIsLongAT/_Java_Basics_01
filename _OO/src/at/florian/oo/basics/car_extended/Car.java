package at.florian.oo.basics.car_extended;

public class Car {
    private String color;
    private Integer maxSpeed;
    private Double basePrice;
    private Double baseConsumption;
    private Integer mileage;
    private Manufacturer manufacturer;
    private Engine engine;

    public Car(String color, Integer maxSpeed, Double basePrice, Double baseConsumption, Integer mileage, Manufacturer manufacturer, Engine engine) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.mileage = mileage;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }

    public Double getPrice() {
        double SellingPrice = this.basePrice * this.manufacturer.getDiscount();
        return SellingPrice;
    }

    public String drive(Integer range) {
        this.mileage = this.mileage + range;
        if (this.mileage >= 500_000) {
            this.baseConsumption = this.baseConsumption * 1.098;
        }
        return "I'm driving";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Double getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(Double baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
