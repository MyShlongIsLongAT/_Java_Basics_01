package at.florian.oo.basics.car_inheritence;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("green",1234,"Ferrari");

        System.out.println(car1.driving());
        System.out.println(car1.breaking());

        Truck truck1 = new Truck("red",5678,"MAN","MAN");

        System.out.println(truck1.driving());
        System.out.println(truck1.getColor());

        RaceCar raceCar1 = new RaceCar("blue",9101112,"Opel","RedBull");

        System.out.println(raceCar1.getSerialNumber());
    }
}
