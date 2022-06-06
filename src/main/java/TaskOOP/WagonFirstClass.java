package TaskOOP;

import java.util.Objects;

public class WagonFirstClass implements Wagon {
    Comfort comfort;
    private int numberOfPassengers;
    private Double weightLuggage;
    private Food food;

    public WagonFirstClass(Comfort comfort, int numberOfPassengers, Double weightLuggage, Food food) {
        this.comfort = comfort;
        this.numberOfPassengers = numberOfPassengers;
        this.weightLuggage = weightLuggage;
        this.food = food;
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
        WagonFirstClass that = (WagonFirstClass) o;
        return numberOfPassengers == that.numberOfPassengers && comfort == that.comfort && Objects.equals(weightLuggage, that.weightLuggage) && food == that.food;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comfort, numberOfPassengers, weightLuggage, food);
    }
}