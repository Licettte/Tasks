package Task_OOP;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private List<Wagon> wagonBuilders = new ArrayList<>();

    public Train(List<Wagon> wagonBuilders) {
        this.wagonBuilders = wagonBuilders;
    }

    public List<Wagon> getWagons() {
        return wagonBuilders;
    }
}