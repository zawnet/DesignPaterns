package abstractfactory.carmanufacture;

public class PremiumCarEquipment implements CarEquipmentFactory{

    @Override
    public Engine createEngine() {
        return null;
    }

    @Override
    public Light createLIght() {
        return null;
    }

    @Override
    public Tire createTire() {
        return null;
    }
}
