package at.florian.oo.basics.lamps;

public class Main {
    public static void main(String[] args) {
        LightElement le1 = new LightElement("1","green");
        LightElement le2 = new LightElement("2","green");
        LightElement le3 = new LightElement("3","green");
        LightElement le4 = new LightElement("4","green");
        LightElement le5 = new LightElement("5","green");
        LightElement le6 = new LightElement("6","green");
        LightElement le7 = new LightElement("7","green");

        Lamp lamp = new Lamp("Lamp1");

        lamp.addLightElements(le1);
        lamp.addLightElements(le2);
        lamp.addLightElements(le3);
        lamp.addLightElements(le4);
        lamp.addLightElements(le5);
        lamp.addLightElements(le6);
        lamp.addLightElements(le7);

        lamp.turnAllOn();
        lamp.turnAllOn();
        System.out.println(lamp.getOverallPowerConsumption());
        lamp.getNamesOfLightElements();
    }
}
