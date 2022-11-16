package at.florian.oo.basics.calculator;

public class ScienceCalculator extends Calculator {
    public double sin(double a){
        return Math.sin(a);
    }

    public double cos(double a){
        return Math.cos(a);
    }

    public ScienceCalculator(String color, String brand) {
        super(color, brand);
    }
}
