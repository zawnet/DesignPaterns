package factorymethod.pizza;

public class AmericanPizzaIngredientFactory implements IngredientFactory{

    @Override
    public Ciasto createCiasto() {
        return  Ciasto.GRUBE;
    }

    @Override
    public Sos createSos() {
        return Sos.OSTRY;
    }

    @Override
    public Ser createSer() {
        return Ser.CHEDAR;
    }
}
