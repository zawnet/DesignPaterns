package factorymethod.pizza;

public class AmericanPizza extends Pizza{
    @Override
    public void getName() {
        System.out.println("American Pizza");
    }

    @Override
    public void przygotowanie() {
        AmericanPizzaIngredientFactory americanPizzaIngredientFactory = new AmericanPizzaIngredientFactory();
        setCiasto(americanPizzaIngredientFactory.createCiasto());
        setSos(americanPizzaIngredientFactory.createSos());
        setSer(americanPizzaIngredientFactory.createSer());

    }

    @Override
    public void pieczenie() {
        System.out.println(getClass().getSimpleName() + " -> Pieczenie");

    }

    @Override
    public void krojenie() {
        System.out.println(getClass().getSimpleName() + " -> Krojenie");
    }

    @Override
    public void pakowanie() {
        System.out.println(getClass().getSimpleName() + " -> Psakowanie");
    }
}
