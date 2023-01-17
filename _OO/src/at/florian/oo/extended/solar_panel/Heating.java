package at.florian.oo.extended.solar_panel;

public class Heating implements ObserverVoltage{
    @Override
    public void inform() {
        System.out.println("Heating is available");
    }
}
