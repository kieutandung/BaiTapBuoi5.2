package SwitchesAndLightBulbs;

public class Main {
    public static void main(String[] args) {
        ElectricLamp electricLamp = new ElectricLamp();
        SwitchButton switchButton = new SwitchButton(electricLamp);
        switchButton.status(10);
    }
}
