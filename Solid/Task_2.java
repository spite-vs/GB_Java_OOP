// public class SpeedCalculation {
// public double calculateAllowedSpeed(Vehicle vehicle) {
// if (vehicle.getType().equalsIgnoreCase("Car")) {
// return vehicle.getMaxSpeed() * 0.8;
// } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
// return vehicle.getMaxSpeed() * 0.6;
// }
// ​
// return 0.0;
// }
// }
// public class Vehicle {
//     int maxSpeed;
//     String type;
//     public Vehicle(int maxSpeed, String type) {
//         this.maxSpeed = maxSpeed;
//         this.type = type;
//     }
//     public int getMaxSpeed() {
//         return this.maxSpeed;
//     }
//     public String getType() {
//         return this.type;
//     }
// }

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * vehicle.getSpeedPar();
    }
}

public class Vehicle {
    private int maxSpeed;
    private String type;
    private double speedPar;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }

    public double getSpeedPar() {
        return speedPar;
    }
}

public class Car extends Vehicle {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
        super.speedPar = 0.8;
    }

    public void setSpeedPar(double speedPar) {
        super.speedPar = speedPar;
    }
}

public class Bus extends Vehicle {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
        super.speedPar = 0.6;
    }

    public void setSpeedPar(double speedPar) {
        super.speedPar = speedPar;
    }
}
