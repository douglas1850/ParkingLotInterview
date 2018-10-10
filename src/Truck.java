

public class Truck implements Vehicle {

    private VehicleType type;

    public Truck(VehicleType type){
        this.type = type; //passed the type (reg/HC) of the bike when initialized
    }

    @Override
    public VehicleSize getSize() {
        return VehicleSize.LARGE;
    }

    @Override
    public VehicleType getType() {
        return type;
    }
}
