package zawnet.designpaterns.abstractfactory.pizza;

public class AmerykanskaPizzernia implements PizzerniaFactory{
    @Override
    public PizzaCreator zamowPizza(String type) {
        PizzaCreator creator = new AmerykanskaPizzaCreator(type);
        creator.przygotowanie();
        creator.pieczenie();
        creator.krojenie();
        creator.pakowanie();
        return creator;
    }
}
