package zawnet.designpaterns.abstractfactory.pizza;

public class WloskaPizzernia implements PizzerniaFactory{
    @Override
    public PizzaCreator zamowPizza(String type) {
        PizzaCreator creator = new WloskaPizzaCreator(type);
        creator.przygotowanie();
        creator.pieczenie();
        creator.krojenie();
        creator.pakowanie();
        return creator;
    }
}
