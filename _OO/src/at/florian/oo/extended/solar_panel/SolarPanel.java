package at.florian.oo.extended.solar_panel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SolarPanel {
    private int voltage;
    private List<ObserverVoltage> observerVoltage = new ArrayList<>();

    public void addObserverVoltage(ObserverVoltage observerVoltage){
        this.observerVoltage.add(observerVoltage);
    }
    public void produce(int duration){
        for(int i=0;i<duration;i++){
            Random rand = new Random();
            int max=20;
            int min=0;
            this.voltage=rand.nextInt((max - min) + 1) + min;
            System.out.println(this.voltage);
            if(this.voltage>18){
                for (ObserverVoltage observerVoltage:this.observerVoltage) {
                    observerVoltage.inform();
                }
            }
        }
    }
}
