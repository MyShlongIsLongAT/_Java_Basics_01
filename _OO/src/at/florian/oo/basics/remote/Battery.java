package at.florian.oo.basics.remote;

public class Battery {
    private double chargingStatus;

    public Battery(double chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public void couple() {
        System.out.println("battery coupled");
    }

    public void decouple() {
        System.out.println("battery decoupled");
    }

    public double getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(double chargingStatus) {
        this.chargingStatus = chargingStatus;
    }
}
