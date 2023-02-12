package Bike;

import Vehicle.Vehicle;

public class Bike extends Vehicle{

    private boolean engineStart;

    public Bike(String model, String make, int numberOfWheels, int topSpeed, boolean engineStart) {
        super(model, make, numberOfWheels, topSpeed);
        this.engineStart = engineStart;
    }
    
    public void accelerate(int speed) {
        this.topSpeed = topSpeed + speed;
     }
     public void hitBreak(int speed) {
        this.topSpeed = topSpeed - speed;
     }
     public void handbrake() {
        this.topSpeed = 0;
     }

     public boolean isEngineStart() {
        return engineStart;
    }
    public void setEngineStart(boolean engineStart) {
        this.engineStart = engineStart;
    }
}

