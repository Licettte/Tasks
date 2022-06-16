package Task_2OOP;

import java.util.List;
import java.util.stream.Collectors;

public final class UtilityClassCalculate {
    private UtilityClassCalculate() {
        throw new java.lang.UnsupportedOperationException("Utility class and cannot be instantiated");
    }

    public static Integer getNumberOfPassenger(Train train) {

        Integer count = train.getWagons().stream().map(s -> s.getNumberOfPassengers()).reduce(0, (a, b) -> a + b);
        System.out.println(count);
        return count;
    }

    public static double getWeight(Train train) {
        double sum = train.getWagons().stream().map(s -> s.getWeightLuggage()).mapToDouble(f -> f).sum();
        System.out.println(sum);
        return sum;
    }

    public static List<Integer> getSortedByComfort(Train train) {
        List<Integer> sorted = train.getWagons().stream().map(s -> s.getComfort()).sorted().collect(Collectors.toList());
        System.out.println(sorted);
        return sorted;
    }
}