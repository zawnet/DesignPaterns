package zawnet.designpaterns.abstractfactory.pizza;

public class PizzeriaProgram {
    public static void main(String[] args) {
        PizzerniaFactory amerykanskaPizzeria = new AmerykanskaPizzernia();
        amerykanskaPizzeria.zamowPizza("serowa");

        PizzerniaFactory wloskaPizzernia = new WloskaPizzernia();
        wloskaPizzernia.zamowPizza("serowa");
    }
}
