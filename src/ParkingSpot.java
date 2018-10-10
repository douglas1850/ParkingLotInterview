

public class ParkingSpot implements Space{
    //using some Vehicle enums since they get basically the same information
    private VehicleSize vehicleSize;
    private VehicleType vehicleType;
    private boolean isTaken;


    public ParkingSpot(VehicleSize vehicleSize, VehicleType vehicleType){
        this.vehicleSize = vehicleSize;
        this.vehicleType = vehicleType;

    }

    @Override
    public VehicleSize getSize() {
        return vehicleSize;
    }

    @Override
    public VehicleType getType() {
        return vehicleType;
    }

    public boolean occupied(){
        return this.isTaken;
    }

    @Override
    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }
}
