package at.florian.oo.basics.car;

public class Tank {
    private int currentFuel;
    private int tankVolume;

    public Tank(int tankVolume) {
        this.currentFuel = tankVolume;
        this.tankVolume = tankVolume;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
