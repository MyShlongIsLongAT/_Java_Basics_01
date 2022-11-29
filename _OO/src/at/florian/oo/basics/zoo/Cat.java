package at.florian.oo.basics.zoo;

public class Cat extends Animal{
    public Cat(double weight, double height) {
        super(weight, height);
    }

    public String meow(){
        return "MEOW";
    }
}
