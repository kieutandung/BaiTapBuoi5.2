package SwitchesAndLightBulbs;

public class SwitchButton {
    private boolean status;
    private ElectricLamp electricLamp;
    public SwitchButton(ElectricLamp electricLamp){
        this.electricLamp = electricLamp;
    }

    public void connectToLamp(ElectricLamp electricLamp){

    }
    public void status(int Times){
        for (int i = 0 ; i < Times;i++){
            if (electricLamp.getStatus()){
                electricLamp.turnOff();
            }else {
                electricLamp.turnOn();
            }
        }
    }
}
