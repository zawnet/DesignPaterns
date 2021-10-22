package zawnet.designpaterns.bulider.house;

import java.util.List;

public class House {
    private final HouseType houseType;
    private final Substructure substructure;
    private final Walls walls;
    private final Roof roof;
    private final List<Window> windows;

    public House(HouseType houseType, Substructure substructure, Walls walls, Roof roof, List<Window> windows) {
        this.houseType = houseType;
        this.substructure = substructure;
        this.walls = walls;
        this.roof = roof;
        this.windows = windows;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public Substructure getSubstructure() {
        return substructure;
    }

    public Walls getWalls() {
        return walls;
    }

    public Roof getRoof() {
        return roof;
    }

    public List<Window> getWindows() {
        return windows;
    }
}
