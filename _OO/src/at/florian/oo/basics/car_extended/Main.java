package at.florian.oo.basics.car_extended;

public class Main {
    public static void main(String[] args) {
        Manufacturer Koenigsegg = new Manufacturer("Koenigsegg","Sweden",0.98);
        Engine KW16 = new Engine(Engine.TYPE.gas,1_013);
        Car Gemera = new Car("matte black",412,100_000.00,20.00,0,Koenigsegg,KW16);

        System.out.println(Gemera.getPrice());
        System.out.println(Gemera.drive(499_000));
        System.out.println(Gemera.getBaseConsumption());
        System.out.println(Gemera.drive(1_000));
        System.out.println(Gemera.getBaseConsumption());
    }
}
