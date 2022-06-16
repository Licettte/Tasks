package Task_2OOP2.version2.Train;

import Task_2OOP2.version2.typeOfWagon.Wagons;

import java.util.List;

public class Trains {
   public List<Wagons> wagons;

    public Trains(List<Wagons> wagons) {
        this.wagons = wagons;
    }


    public List<Wagons> getWagons() {
        return wagons;
    }
}
