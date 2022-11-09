package at.florian.oo.basics.lamps;

public class LightElement {
    private String name;
    private String color;
    private double powerConsumption;
    private boolean status;

    public LightElement(String name, String color) {
        this.name = name;
        this.color = color;
        this.powerConsumption = 3;
        this.status = false;
    }

    public String turnOn(){
        this.powerConsumption = this.powerConsumption+5;
        if (status){
            return "My name is "+ this.name + " and I'm already turned ON";
        }else {
            this.status=true;
            return "My name is " + this.name + " and I'm now ON";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
