package factorymethod.pizza;

public class IitalianPizzaIngredientFactory implements IngredientFactory{

    @Override
    public Ciasto createCiasto() {
        return  Ciasto.CIENKIE;
    }

    @Override
    public Sos createSos() {
        return Sos.POMIDOROWY;
    }

    @Override
    public Ser createSer() {
        return Ser.MOZZARELLA;
    }
}
