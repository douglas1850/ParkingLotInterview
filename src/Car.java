

public class Car implements Vehicle {

    private Vehicle.VehicleType type;

    public Car(Vehicle.VehicleType type){
        this.type = type; //passed the type (reg/HC) of the bike when initialized
    }

    @Override
    public Vehicle.VehicleSize getSize() {
        return Vehicle.VehicleSize.MEDIUM;
    }

    @Override
    public Vehicle.VehicleType getType() {
        return type;
    }
}
