package simplefactory;

public class SimpleFactoryProgram {

    public static void main(String[] args) {
        CarManufacture carManufacture = new CarManufacture();
        carManufacture.manufactureCar("Ferrari");
    }
}
