package Truck;
import Vehicle.Vehicle;

public class Truck extends Vehicle{
    private boolean hasAC;
    private boolean hasHandBrake;
    private boolean hasSound;
    private boolean engineStart;
    private boolean isContainerOpen;
    public Truck(String model, String make, int numberOfWheels, int topSpeed, boolean hasAC, boolean hasHandBrake, boolean hasSound, boolean engineStart,boolean isContainerOpen) {
        super(model, make, numberOfWheels, topSpeed);
        this.hasAC = hasAC;
        this.hasHandBrake = hasHandBrake;
        this.hasSound = hasSound;
        this.engineStart = engineStart;
        this.isContainerOpen = isContainerOpen;
    }
    public void openContainer(){
        this.isContainerOpen = true;
    }
    public void accelerate(int speed) {
        this.topSpeed = topSpeed + speed;
     }
    public void handbrake() {
        this.topSpeed = 0;
     }

     public String toString() {
        return "Properties : Model = " + getModel();
      }
    public boolean isHasAC() {
        return hasAC;
    }
    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }
    public boolean isHasHandBrake() {
        return hasHandBrake;
    }
    public void setHasHandBrake(boolean hasHandBrake) {
        this.hasHandBrake = hasHandBrake;
    }
    public boolean isHasSound() {
        return hasSound;
    }
    public void setHasSound(boolean hasSound) {
        this.hasSound = hasSound;
    }
    public boolean isEngineStart() {
        return engineStart;
    }
    public void setEngineStart(boolean engineStart) {
        this.engineStart = engineStart;
    }
    public boolean isContainerOpen() {
        return isContainerOpen;
    }
    public void setContainerOpen(boolean isContainerOpen) {
        this.isContainerOpen = isContainerOpen;
    }

}
