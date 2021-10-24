package abstractfactory.carmanufacture;

public class EconomyCarEquipment implements CarEquipmentFactory{

    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }

    @Override
    public Light createLIght() {
        return new HalogenLight();
    }

    @Override
    public Tire createTire() {
        return new EconomyTire();
    }
}
