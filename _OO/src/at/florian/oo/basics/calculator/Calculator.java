package at.florian.oo.basics.calculator;

public class Calculator {
    private String color;
    private String brand;

    public Calculator(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }
}
