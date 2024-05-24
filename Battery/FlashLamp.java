package Battery;

public class FlashLamp {
    private Battery battery;
    private  boolean status;
    public void setBattery(Battery battery){
        this.battery = battery;
    }
    public int getBatteryInfo(){
        return this.battery.getEnergy();
    }
    public void light(){
        if (this.status){
            System.out.println("Lighting");
        }
        else {
            System.out.println("Not Lighting");
        }
    }
    public void turnOn(){
        this.status = true;
    }
    public void turnOff(){
        this.status = false;
    }
}
