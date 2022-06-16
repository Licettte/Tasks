package Task_2OOP2.version2;

import Task_2OOP2.version2.Train.Trains;
import Task_2OOP2.version2.calculate.UtilityClassCalculate;
import Task_2OOP2.version2.typeOfWagon.Food;
import Task_2OOP2.version2.typeOfWagon.Wagons;
import Task_2OOP2.version2.typeOfWagon.WagonsFirstClass;
import Task_2OOP2.version2.typeOfWagon.WagonsSecondClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Wagons firstClass = new WagonsFirstClass(1, 3, 123.0, "Dir", Food.POTATO);
        Wagons secondClass = new WagonsSecondClass(2, 3, 123.0, "Mir");

        List<Wagons> wagons = new ArrayList<>();
        wagons.add(firstClass);
        wagons.add(secondClass);

        Trains trains = new Trains(wagons);

        UtilityClassCalculate.getNumberOfPassenger(trains);
        UtilityClassCalculate.getWeight(trains);
        UtilityClassCalculate.getSortedByComfort(trains);

    }
}
