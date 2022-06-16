package Task_2OOP2.version2.calculate;

import Task_2OOP2.version2.Train.Trains;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public final class UtilityClassCalculate {
    static Logger log = Logger.getLogger(UtilityClassCalculate.class.getName());

    private UtilityClassCalculate() {
        throw new UnsupportedOperationException("Utility class and cannot be instantiated");
    }

    public static Integer getNumberOfPassenger(Trains train) {

        Integer count = train.getWagons().stream().map(s -> s.getNumberOfPassengers()).reduce(0, (a, b) -> a + b);
        log.info(count + " count");
        return count;
    }

    public static double getWeight(Trains train) {
        double sum = train.getWagons().stream().map(s -> s.getWeightLuggage()).mapToDouble(f -> f).sum();
        log.info(sum + " sum");
        return sum;
    }

    public static List<Integer> getSortedByComfort(Trains train) {
        List<Integer> sorted = train.getWagons().stream().map(s -> s.getComfort()).sorted().collect(Collectors.toList());
        log.info(sorted + " sorted");
        return sorted;
    }
}
