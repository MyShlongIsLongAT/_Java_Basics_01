package at.florian.oo.basics.phone;

public class PhoneFile {
    private String extension;
    private double size;
    private String name;

    public PhoneFile(String extension, double size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public String getInfo() {
        return this.name + "." + this.extension + " has a size of " + this.size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public double getSize() {
        return size;
    }
}
