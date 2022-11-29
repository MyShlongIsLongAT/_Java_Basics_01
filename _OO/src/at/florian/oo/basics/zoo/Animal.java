package at.florian.oo.basics.zoo;

public class Animal {
    private double weight;
    private double height;

    public Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public String move(){
        return "I am moving";
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
