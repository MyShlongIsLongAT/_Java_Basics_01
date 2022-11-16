package at.florian.oo.basics.car_inheritence;

public class Truck extends Car {
    private String trailer;

    public Truck(String color, Integer serialNumber, String brand, String trailer) {
        super(color, serialNumber, brand);
        this.trailer = trailer;
    }

    @Override
    public String driving() {
        return "I am driving the Truck, consumption is high";
        //return super.driving();
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
