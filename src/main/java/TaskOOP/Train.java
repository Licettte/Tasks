package TaskOOP;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private List<Wagon> wagons = new ArrayList<>();

    public Train(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }
}
