package at.florian.oo.basics.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Schönbrunn","Musterstraße 1");

        Cat cat1 = new Cat(10,10);
        Dog dog1 = new Dog(20,10);

        zoo.addAnimals(cat1);
        zoo.addAnimals(dog1);

        System.out.println(zoo.getAnimals().get(1).getWeight());
    }
}
