package at.florian.oo.basics.car_inheritence;

public class RaceCar extends Car {
    private String wing;

    public RaceCar(String color, Integer serialNumber, String brand, String wing) {
        super(color, serialNumber, brand);
        this.wing = wing;
    }
}
