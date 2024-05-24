package Battery;

public class Battery {
    private int energy ;
    public int getEnergy(){
        return this.energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public void decreasenergy(){
        if (this.energy > 0){
            this.energy--;
        }
    }
}

