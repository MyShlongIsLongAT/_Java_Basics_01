package at.florian.oo.basics.phone;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private String color;
    private SIM sim;
    private Camera camera;
    private SDCard sdCard;

    public Phone(String color, SIM sim, Camera camera, SDCard sdCard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdCard = sdCard;
    }

    public String takePicture() {
        PhoneFile photo = this.camera.makePicture();
        this.sdCard.saveFile(photo);
        return "Picture was taken";
    }

    public String makeCall(String contact) {
        return this.sim.doCall(contact);
    }

    public double getFreeSpace() {
        return this.sdCard.getFreeSpace();
    }

    public List<String> printAllFiles() {
        return this.sdCard.getAllFiles();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }
}
