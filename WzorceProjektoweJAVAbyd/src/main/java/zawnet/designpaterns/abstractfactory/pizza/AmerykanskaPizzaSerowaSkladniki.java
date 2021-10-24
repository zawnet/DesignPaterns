package zawnet.designpaterns.abstractfactory.pizza;

public class AmerykanskaPizzaSerowaSkladniki implements FabrykaSkladnikow{

    @Override
    public Ciasto createCiasto() {
        return Ciasto.GRUBE;
    }

    @Override
    public Sos createSos() {
        return Sos.CZOSNKOWY;
    }

    @Override
    public Ser createSer() {
        return Ser.CHEDDAR;
    }
}
