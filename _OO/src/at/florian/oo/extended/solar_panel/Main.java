package at.florian.oo.extended.solar_panel;

public class Main {
    public static void main(String[] args) {
        SolarPanel solarPanel = new SolarPanel();
        Heating heating = new Heating();
        Loadbalancer loadbalancer = new Loadbalancer();
        Dishwasher dishwasher = new Dishwasher();

        solarPanel.addObserverVoltage(heating);
        solarPanel.addObserverVoltage(loadbalancer);
        solarPanel.addObserverVoltage(dishwasher);

        solarPanel.produce(10);
    }
}
