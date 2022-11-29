package at.florian.oo.basics.phone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Camera {
    private double resolution;

    public Camera(double resolution) {
        this.resolution = resolution;
    }

    public PhoneFile makePicture() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss");
        PhoneFile newImage = new PhoneFile("png", Math.pow(resolution, 2), formatter.format(date));
        return newImage;
    }
}
