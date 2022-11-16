package at.florian.oo.basics.calculator;

public class RootCalculator extends Calculator {
    public double root(int a){
        return Math.sqrt(a);
    }

    public RootCalculator(String color, String brand) {
        super(color, brand);
    }
}
