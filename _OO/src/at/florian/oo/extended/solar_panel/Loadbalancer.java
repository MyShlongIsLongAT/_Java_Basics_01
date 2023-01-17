package at.florian.oo.extended.solar_panel;

public class Loadbalancer implements ObserverVoltage{
    @Override
    public void inform() {
        System.out.println("Loadbalancer is available");
    }
}
