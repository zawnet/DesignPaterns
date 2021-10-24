package factorymethod.carmanufacture;

public class FactoryMethodProgram {

    public static void main(String[] args) {
        CarFactory carFactory = new EuropeanCarFactory();
        carFactory.manufactureCar("Ferrari");

        carFactory = new AmericanCarFactory();
        carFactory.manufactureCar("Ferrari");
    }
}
