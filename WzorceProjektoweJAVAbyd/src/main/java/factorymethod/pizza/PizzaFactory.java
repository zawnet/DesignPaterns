package factorymethod.pizza;

public abstract class PizzaFactory {
    protected abstract Pizza create(String type);
}
