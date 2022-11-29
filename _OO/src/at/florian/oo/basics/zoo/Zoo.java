package at.florian.oo.basics.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String address;

    private List<Animal> animals;

    public Zoo(String name, String address) {
        this.name = name;
        this.address = address;
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimals(Animal animal) {
        this.animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
