package factorymethod.pizza;

public class AmericanPizzeria extends AmericanPizzaCreator {

    @Override
    public Pizza create(String type) {
        return super.create(type);
    }
}
