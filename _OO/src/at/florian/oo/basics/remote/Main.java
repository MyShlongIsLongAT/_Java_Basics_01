package at.florian.oo.basics.remote;

public class Main {
    public static void main(String[] args) {
        Battery battery1 = new Battery(100.00);
        Battery battery2 = new Battery(100.00);

        Remote remote = new Remote();
        remote.addBatteries(battery1);
        remote.addBatteries(battery2);

        System.out.println(remote.getStatus());
        System.out.println(remote.turnOn());
        System.out.println(remote.getStatus());
        System.out.println(remote.turnOff());
        System.out.println(remote.turnOn());
        System.out.println(remote.getStatus());
    }
}
