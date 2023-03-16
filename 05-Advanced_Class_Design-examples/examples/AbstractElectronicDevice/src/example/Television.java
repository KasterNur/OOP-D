package example;

public class Television extends ElectronicDevice {

    public void turnOn() {
        changeChannel(1);
        initializeScreen();
    }
    public void turnOff() {}
    
    public void changeChannel(int channel) {
       System.out.println(" Channel 1");
    }
    public void initializeScreen() {
       System.out.println("initialized....");
    }
}