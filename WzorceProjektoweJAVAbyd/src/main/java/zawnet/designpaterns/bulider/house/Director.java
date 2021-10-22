package zawnet.designpaterns.bulider.house;

import java.util.ArrayList;
import java.util.List;

public class Director {
    public void constructSmallHouse(Builder builder){
        builder.setHauseType(HouseType.SMALL);
        builder.setSubstructure(new Substructure());
        builder.setRoof(new Roof());
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();
        List<Window> windows = new ArrayList<>();
        windows.add(window1);
        windows.add((window2));
        windows.add(window3);
        builder.setWindows(windows);
    }
}
