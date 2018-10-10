

public interface Vehicle {
    enum VehicleSize{
        SMALL,
        MEDIUM,
        LARGE,
    }

    enum VehicleType{
        REGULAR,
        HANDICAPPED
    }

    VehicleSize getSize(); //all cars MUST choose a size
    VehicleType getType(); //all car MUST choose a type
}
