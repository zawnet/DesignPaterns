package simplefactory;

public class CarManufacture {



    public void manufactureCar(String type) {
        Car car = SimpleFactory.createCar(type);

        car.getName();
        car.start();
        car.accelerate();
        car.stop();
    }
}
