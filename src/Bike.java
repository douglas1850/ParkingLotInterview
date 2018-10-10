

public class Bike implements Vehicle {

    private VehicleType type;

    public Bike(VehicleType type){
        this.type = type; //passed the type (reg/HC) of the bike when initialized
    }

    @Override
    public VehicleSize getSize() {
        return VehicleSize.SMALL;
    }

    @Override
    public VehicleType getType() {
        return type;
    }
}
