package zawnet.designpaterns.bulider.car;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmision;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmision, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmision = transmision;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info =  "Manual: \n";
        info +="carType=" + carType+"\n";
        info +="sets=" + seats+"\n";
        info +="Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info +="transmision=" + transmision+"\n";
        if(this.tripComputer != null){
            info += "Trip computer: Functional"+"\n";
        }
        else {
            info += "Trip computer: N/A"+"\n";
        }
        if(this.gpsNavigator != null){
            info += "GPS Navigator: Functional"+"\n";
        }
        else{
            info += "GPS Navigator: N/A"+"\n";
        }
        return info;
    }
}
