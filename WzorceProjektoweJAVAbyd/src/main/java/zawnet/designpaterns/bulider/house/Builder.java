package zawnet.designpaterns.bulider.house;

import java.util.List;

public interface Builder {
    public void setHauseType(HouseType type);
    public void setSubstructure(Substructure substructure);
    public void setWalls(Walls walls);
    public void setRoof(Roof roof);
    public void setWindows(List<Window> windows);
}
