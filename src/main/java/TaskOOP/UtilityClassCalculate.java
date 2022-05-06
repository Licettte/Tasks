package TaskOOP;

public class UtilityClassCalculate {

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
}
