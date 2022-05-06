package TaskOOP;

import java.util.Objects;

public class WagonSecondClass implements Wagon {

    private Comfort comfort;
    private int numberOfPassengers;
    private Double weightLuggage;

    public WagonSecondClass(Comfort comfort, int numberOfPassengers, Double weightLuggage) {
        this.comfort = comfort;
        this.numberOfPassengers = numberOfPassengers;
        this.weightLuggage = weightLuggage;
    }

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public double getWeightLuggage() {
        return weightLuggage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WagonSecondClass that = (WagonSecondClass) o;
        return numberOfPassengers == that.numberOfPassengers && comfort == that.comfort && Objects.equals(weightLuggage, that.weightLuggage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comfort, numberOfPassengers, weightLuggage);
    }

    @Override
    public String toString() {
        return "WagonSecondClass{" +
                "comfort=" + comfort +
                ", numberOfPassengers=" + numberOfPassengers +
                ", weightLuggage=" + weightLuggage +
                '}';
    }}