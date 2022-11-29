package at.florian.oo.basics.zoo;

public class Dog extends Animal{
    public Dog(double weight, double height) {
        super(weight, height);
    }

    public String bark(){
        return "Woof";
    }
}
