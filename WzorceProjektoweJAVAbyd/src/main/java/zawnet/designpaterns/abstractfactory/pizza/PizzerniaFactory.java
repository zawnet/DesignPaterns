package zawnet.designpaterns.abstractfactory.pizza;

public interface PizzerniaFactory {

    PizzaCreator zamowPizza(String type);
}
