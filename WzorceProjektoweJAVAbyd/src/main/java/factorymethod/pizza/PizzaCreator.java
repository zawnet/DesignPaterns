package factorymethod.pizza;

public class PizzaCreator extends PizzaFactory {

    public Pizza create(String type){
        if("Italian".equals(type)){
            return new ItalianPizza();
        }
        else if ("American".equals(type)){
            return new AmericanPizza();
        }
        else{
            throw new IllegalArgumentException("Unknown type: "+ type);
        }
    }
}
