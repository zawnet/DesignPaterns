package factorymethod.simple;

public class ConcreteFactory extends Factory{

    @Override
    public Product factoryMethod() {
        return new Product();
    }
}
