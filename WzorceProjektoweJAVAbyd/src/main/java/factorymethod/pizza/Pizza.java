package factorymethod.pizza;

public abstract class Pizza {

    private String name;
    private Ciasto ciasto;
    private Sos sos;
    private Ser ser;
    public abstract void getName();

    public abstract void przygotowanie();
    public abstract void pieczenie();
    public abstract void krojenie();
    public abstract void pakowanie();

    public void setName(String name) {
        this.name = name;
    }

    public void setCiasto(Ciasto ciasto) {
        this.ciasto = ciasto;
    }

    public void setSos(Sos sos) {
        this.sos = sos;
    }

    public void setSer(Ser ser) {
        this.ser = ser;
    }
}
