package at.florian.oo.basics.phone;

public class Main {
    public static void main(String[] args) {
        SIM mySim = new SIM(1234, "+43 660 1233511");
        Camera myCamera = new Camera(2);
        SDCard mySDCard = new SDCard(100);
        Phone myPhone = new Phone("Space Grey", mySim, myCamera, mySDCard);

        System.out.println(myPhone.getFreeSpace());
        System.out.println(myPhone.takePicture());
        System.out.println(myPhone.takePicture());
        System.out.println(myPhone.takePicture());
        System.out.println(myPhone.getFreeSpace());
        System.out.println(myPhone.printAllFiles());
        System.out.println(myPhone.makeCall("Manuel"));
    }
}
