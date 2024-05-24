package Battery;

public class Main {
    public static void main(String[] args) {
        Battery battery = new Battery();
        battery.setEnergy(10);
        FlashLamp flashLamp = new FlashLamp();
        flashLamp.setBattery(battery);
        flashLamp.turnOn();
        flashLamp.light();
        flashLamp.turnOff();
        flashLamp.light();
        System.out.println(flashLamp.getBatteryInfo());
    }
}
