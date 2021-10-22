package zawnet.designpaterns.bulider.house;

public class Demo {
    public static void main(String[] args) {
        Director  director = new Director();
        HouseBuilder builder = new HouseBuilder();
        director.constructSmallHouse(builder);

        House house = builder.getResult();
    }
}
