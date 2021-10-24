package factorymethod.pizza;

public class AmericanPizzaCreator extends AmericanPizza {

    public Pizza create(String type){
        return new AmericanPizzaCreator().create(type);
    }
}
