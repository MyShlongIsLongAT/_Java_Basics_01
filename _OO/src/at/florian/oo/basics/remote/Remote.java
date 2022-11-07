package at.florian.oo.basics.remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private boolean isOn;
    private boolean hasPower;
    private List<Battery> batteries;

    public String turnOn() {
        this.isOn = true;
        for (int i = 0; i < this.batteries.size(); i++) {
            this.batteries.get(i).setChargingStatus(this.batteries.get(i).getChargingStatus() - 5);
            this.batteries.get(i).couple();
        }
        return "TV is now ON";
    }

    public String turnOff() {
        this.isOn = false;
        for (int i = 0; i < this.batteries.size(); i++) {
            this.batteries.get(i).decouple();
        }
        return "TV is now OFF";
    }

    public Remote() {
        this.batteries = new ArrayList<Battery>();
    }

    public String getStatus() {
        double batteryLoadSum = 0;
        for (int i = 0; i < this.batteries.size(); i++) {
            batteryLoadSum = batteryLoadSum + this.batteries.get(i).getChargingStatus();
        }
        double averageChargingStatus = batteryLoadSum / this.batteries.size();
        if (averageChargingStatus == 0) {
            return "Batteries are empty";
        } else if (averageChargingStatus < 20) {
            return "Please recharge the batteries";
        } else {
            return "" + averageChargingStatus;
        }
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void addBatteries(Battery battery) {
        if (this.batteries.size() < 2) {
            this.batteries.add(battery);
        } else {
            System.out.println("There is no space for another battery");
        }
    }
}
