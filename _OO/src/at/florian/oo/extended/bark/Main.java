package at.florian.oo.extended.bark;

import at.florian.oo.extended.bark.Strategy.BarkStrategy;
import at.florian.oo.extended.bark.Strategy.WuffWuff;
import at.florian.oo.extended.bark.Strategy.Wuuuuf;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BarkStrategy WuffWuff = new WuffWuff();
        BarkStrategy Wuuuuf = new Wuuuuf();

        Date birthdayJürgen = new Date(2004,7,12);
        AbstractDog Jürgen = new Dodge("Jürgen", birthdayJürgen, Wuuuuf);

        Jürgen.run();
    }
}
