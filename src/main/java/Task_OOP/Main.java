package Task_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Wagon firstClass = new Wagon.WagonBuilder(Comfort.FIRSTCLASS, 2, 9, 65.9).food(Food.POTATO).name("First class").build();
        Wagon secondClass = new Wagon.WagonBuilder(Comfort.SECONDCLASS, 7, 8, 787.9).build();

        System.out.println(secondClass);
        System.out.println(firstClass);

        List<Wagon> wagons = new ArrayList<>();
        wagons.add(firstClass);
        wagons.add(secondClass);

        Train train = new Train(wagons);

        UtilityClassCalculate.getNumberOfPassenger(train);
        UtilityClassCalculate.getWeight(train);
        UtilityClassCalculate.getSortedByComfort(train);

    }
}