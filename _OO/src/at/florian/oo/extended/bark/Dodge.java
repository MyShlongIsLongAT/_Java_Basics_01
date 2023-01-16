package at.florian.oo.extended.bark;

import at.florian.oo.extended.bark.Strategy.BarkStrategy;


import java.time.LocalDate;
import java.util.Date;

public class Dodge extends AbstractDog{
    public Dodge(String name, Date birthday, BarkStrategy barkStrategy) {
        super(name, birthday, barkStrategy);
    }

    @Override
    public void run() {
        System.out.println("My name is "+ name);
        barkStrategy.bark();
    }
}
