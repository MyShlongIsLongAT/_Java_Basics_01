public class Main {
    public static void main(String[] args) {
        Tank tank1 = new Tank(60);
        Engine engine1 = new Engine(110, "xyz", "Mercedes", Engine.TYPE.gas, 6);
        Car car1 = new Car("A1234", "Tesla", "Matte Black", "Model X", engine1, tank1);
        car1.breaking();
        car1.turboBoost();
        car1.honk(3);
        car1.getRemainingRange();

        car1.getInfo();
    }
}