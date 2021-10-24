package abstractfactory.carmanufacture;

public  interface CarEquipmentFactory {

    Engine createEngine();
    Light createLIght();
    Tire createTire();
}
