package Task_2OOP.version1;

import java.util.List;

public class Train {
    private List<Wagon> wagonBuilders;
    public Train(List<Wagon> wagonBuilders) {
        this.wagonBuilders = wagonBuilders;
    }
    public List<Wagon> getWagons() {
        return wagonBuilders;
    }
}
