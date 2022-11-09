package at.florian.oo.basics.lamps;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private String name;
    private List<LightElement> lightElements;

    public Lamp(String name) {
        this.name = name;
        this.lightElements = new ArrayList<LightElement>();
    }

    public void turnAllOn(){
        for (int i = 0; i < this.lightElements.size(); i++) {
            System.out.println(this.lightElements.get(i).turnOn());
        }
        System.out.println("Process accomplished");
    }

    public Double getOverallPowerConsumption(){
        double sum=0;
        for (int i = 0; i < this.lightElements.size(); i++) {
            sum = sum + this.lightElements.get(i).getPowerConsumption();
        }
        return sum;
    }

    public void getNamesOfLightElements (){
        for (int i = 0; i < this.lightElements.size(); i++) {
            System.out.println(this.lightElements.get(i).getName());
        }
    }

    public List<LightElement> getLightElements() {
        return this.lightElements;
    }

    public void addLightElements(LightElement lightElement) {
        this.lightElements.add(lightElement);
    }
}
