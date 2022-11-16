package at.florian.oo.basics.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator("black", "TI");
        ScienceCalculator sC1 = new ScienceCalculator("back","TI");
        RootCalculator rC1 = new RootCalculator("pink","Apple");

        System.out.println(c1.add(1,2));
        System.out.println(sC1.sin(1));
        System.out.println(rC1.root(4));
    }
}
