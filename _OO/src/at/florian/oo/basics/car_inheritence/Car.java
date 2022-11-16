package at.florian.oo.basics.car_inheritence;

public class Car {
    private String color;
    private Integer serialNumber;
    private String brand;

    public Car(String color, Integer serialNumber, String brand) {
        this.color = color;
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    public String driving() {
        return "I am driving";
    }

    public String breaking() {
        return "I am breaking";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getBrand() {
        return brand;
    }
}
