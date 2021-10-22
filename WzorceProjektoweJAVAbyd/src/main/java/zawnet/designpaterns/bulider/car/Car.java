package zawnet.designpaterns.bulider.car;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmision;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel;

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmision() {
        return transmision;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public Car(
            CarType carType,
            int seats,
            Engine engine,
            Transmission transmission,
            TripComputer tripComputer,
            GPSNavigator gpsNavigator
    ){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmision = transmission;
        this.tripComputer = tripComputer;
        if(this.tripComputer != null ){
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;


    }

}
