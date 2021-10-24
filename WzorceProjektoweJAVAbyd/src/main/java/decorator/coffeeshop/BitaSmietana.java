package decorator.coffeeshop;

public class BitaSmietana extends SklanikDekorator{

    private final Napoj napoj;

    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzNazwe() {
        return napoj.pobierzNazwe() + ", Bita Smietana";
    }

    @Override
    public float koszt() {
        return napoj.koszt() + 2.99f;
    }
}
