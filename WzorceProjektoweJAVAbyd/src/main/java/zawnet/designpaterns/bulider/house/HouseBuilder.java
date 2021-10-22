package zawnet.designpaterns.bulider.house;

import java.util.List;

public class HouseBuilder implements Builder{

    private HouseType houseType;
    private Substructure substructure;
    private Walls walls;
    private Roof roof;
    private List<Window> windows;

    @Override
    public void setHauseType(HouseType type) {
        this.houseType = type;
    }

    @Override
    public void setSubstructure(Substructure substructure) {
        this.substructure = substructure;
    }

    @Override
    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public House getResult(){
        return new House(
                houseType,
                substructure,
                walls,
                roof,
                windows
        );
    }
}
