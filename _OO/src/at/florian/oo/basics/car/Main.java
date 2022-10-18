package at.florian.oo.basics.car;

public class Main {
    public static void main(String[] args) {
        Tank tank1 = new Tank(60);
        Engine engine1 = new Engine(110, "xyz", "Mercedes", Engine.TYPE.gas, 6);
        RearMirror rearMirror1 = new RearMirror(10,0);
        RearMirror rearMirror2 = new RearMirror(10,0);

        Tire tire1 = new Tire(12,3);
        Tire tire2 = new Tire(12,3);
        Tire tire3 = new Tire(12,3);
        Tire tire4 = new Tire(12,3);


        Car car1 = new Car("A1234", "Tesla", "Matte Black", "Model X", engine1, tank1);
        car1.addRearMirrors(rearMirror1);
        car1.addRearMirrors(rearMirror2);

        car1.addTires(tire1);
        car1.addTires(tire2);
        car1.addTires(tire3);
        car1.addTires(tire4);

        car1.breaking();
        car1.turboBoost();
        car1.honk(3);
        car1.getRemainingRange();

        car1.getInfo();
        car1.driving(1,100);

        System.out.println(car1.getRearMirrors().get(0).getSize());
        System.out.println(car1.getTires().get(0).getDiameter());
    }
}