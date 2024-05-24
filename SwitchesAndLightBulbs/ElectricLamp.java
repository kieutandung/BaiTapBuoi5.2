package SwitchesAndLightBulbs;

public class ElectricLamp {
    private boolean status;
    public ElectricLamp(){
        this.status =false;
    }
    public void turnOn(){
        this.status = true;
        System.out.println("bóng đèn đang bật");
    }
    public void turnOff(){
        this.status = false;
        System.out.println("bóng đèn đang tắt");
    }
    public boolean getStatus(){
        return this.status;
    }
}
