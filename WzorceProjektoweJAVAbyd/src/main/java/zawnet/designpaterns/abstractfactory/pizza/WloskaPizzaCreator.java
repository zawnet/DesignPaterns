package zawnet.designpaterns.abstractfactory.pizza;

public class WloskaPizzaCreator extends Pizza implements PizzaCreator{

    private final String type;

    public WloskaPizzaCreator(String type) {
        this.type = type;
    }

    @Override
    public void przygotowanie() {
        FabrykaSkladnikow skladniki;
        if ("serowa".equals(type)) {
            skladniki = new WloskaPizzaSerowaSkladniki();
            setCiasto(skladniki.createCiasto());
            setSer(skladniki.createSer());
            setSos(skladniki.createSos());
        }

    }

    @Override
    public void pieczenie() {
        System.out.println(getClass().getSimpleName()+", Pieczenie ");
    }

    @Override
    public void krojenie() {
        System.out.println(getClass().getSimpleName()+", Krojenie ");
    }

    @Override
    public void pakowanie() {
        System.out.println(getClass().getSimpleName()+", Pakowanie ");
    }
}
