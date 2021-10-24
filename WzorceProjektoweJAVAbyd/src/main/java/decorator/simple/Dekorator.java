package decorator.simple;

public abstract class Dekorator extends Skladnik {

    private final Skladnik skladnik;

    public Dekorator(Skladnik skladnik) {
        this.skladnik = skladnik;
    }

    @Override
    public String print() {
        return "Składnik";
    }
}
