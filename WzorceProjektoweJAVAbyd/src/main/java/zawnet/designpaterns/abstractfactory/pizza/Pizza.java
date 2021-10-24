package zawnet.designpaterns.abstractfactory.pizza;

public abstract class  Pizza {
    private String nazwa;
    private Ciasto ciasto;
    private Ser ser;
    private Sos sos;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCiasto(Ciasto ciasto) {
        this.ciasto = ciasto;
    }

    public void setSer(Ser ser) {
        this.ser = ser;
    }

    public void setSos(Sos sos) {
        this.sos = sos;
    }
}
