package zawnet.designpaterns.bulider.car;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportCar(manualBuilder);

        Manual manual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());

        car.getEngine().on();
        car.getTripComputer().showStatus();
        car.getEngine().off();
        car.getTripComputer().showStatus();
    }
}
