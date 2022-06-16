package Task_2OOP.version1;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {


        Wagon firstClass = new Wagon.WagonBuilder(Comfort.FIRSTCLASS, 2, 9, 65.9)
                .food(Food.POTATO).name("First class").build();
        Wagon secondClass = new Wagon.WagonBuilder(Comfort.SECONDCLASS, 7, 8, 787.9)
                .build();
        log.info(firstClass+ " firstClass");
        log.info(secondClass+ " secondClass");

        List<Wagon> wagons = new ArrayList<>();
        wagons.add(firstClass);
        wagons.add(secondClass);

        Train train = new Train(wagons);

        UtilityClassCalculate.getNumberOfPassenger(train);
        UtilityClassCalculate.getWeight(train);
        UtilityClassCalculate.getSortedByComfort(train);
    }
}
