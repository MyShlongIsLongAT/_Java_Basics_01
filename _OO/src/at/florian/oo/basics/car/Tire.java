package at.florian.oo.basics.car;

public class Tire {
    private int diameter;
    private int currentPressure;

    public Tire(int diameter, int currentPressure) {
        this.diameter = diameter;
        this.currentPressure = currentPressure;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getCurrentPressure() {
        return currentPressure;
    }

    public void setCurrentPressure(int currentPressure) {
        this.currentPressure = currentPressure;
    }
}
