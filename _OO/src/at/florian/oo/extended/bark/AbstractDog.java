package at.florian.oo.extended.bark;

import at.florian.oo.extended.bark.Strategy.BarkStrategy;

import java.time.LocalDate;
import java.util.Date;

public abstract class AbstractDog implements Animal {
    protected String name;
    protected Date birthday;
    public BarkStrategy barkStrategy;

    public AbstractDog(String name, Date birthday, BarkStrategy barkStrategy) {
        this.name = name;
        this.birthday = birthday;
        this.barkStrategy = barkStrategy;
    }
}