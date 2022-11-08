package at.florian.oo.basics.car_extended;

public class Engine {
    public enum TYPE {diesel, gas};
    private TYPE type;
    private Integer horsepower;

    public Engine(TYPE type, Integer horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }
}
