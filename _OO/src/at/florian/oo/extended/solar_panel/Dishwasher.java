package at.florian.oo.extended.solar_panel;

public class Dishwasher implements ObserverVoltage{
    @Override
    public void inform() {
        System.out.println("Dishwasher is available");
    }
}
