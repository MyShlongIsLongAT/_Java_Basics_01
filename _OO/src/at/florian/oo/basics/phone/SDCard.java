package at.florian.oo.basics.phone;

import at.florian.oo.basics.lamps.LightElement;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private double capacity;
    private List<PhoneFile> files;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<PhoneFile>();
    }

    public List<String> getAllFiles() {
        List<String> allFiles = new ArrayList<String>();
        for (int i = 0; i < this.files.size(); i++) {
            allFiles.add(this.files.get(i).getInfo());
        }
        return allFiles;
    }

    public void saveFile(PhoneFile file) {
        this.files.add(file);
    }

    public double getFreeSpace() {
        double usedSpace = 0;
        for (int i = 0; i < this.files.size(); i++) {
            usedSpace += this.files.get(i).getSize();
        }
        return capacity - usedSpace;
    }
}
