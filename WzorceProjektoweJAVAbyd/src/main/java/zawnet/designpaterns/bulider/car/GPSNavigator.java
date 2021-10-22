package zawnet.designpaterns.bulider.car;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Miejsce startowe do Miejsce docelowe";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
