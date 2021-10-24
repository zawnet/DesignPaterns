package decorator.coffeeshop;

public class Cukier extends SklanikDekorator{

    private final Napoj napoj;

    public Cukier(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzNazwe() {
        return napoj.pobierzNazwe() + ", Cukier";
    }

    @Override
    public float koszt() {
        return napoj.koszt() + 0.99f;
    }
}
