package factorymethod.pizza;

public interface IngredientFactory {
    public Ciasto createCiasto();
    public Sos createSos();
    public Ser createSer();

}
