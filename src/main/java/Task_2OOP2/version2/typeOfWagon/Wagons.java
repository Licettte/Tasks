package Task_2OOP2.version2.typeOfWagon;


public abstract class Wagons {

    public final int comfort;
    public final int numberOfPassengers;
    public final Double weightLuggage;
    public final String name;

    public Wagons(int comfort, int numberOfPassengers, Double weightLuggage, String name) {

        this.comfort = comfort;
        this.numberOfPassengers = numberOfPassengers;
        this.weightLuggage = weightLuggage;
        this.name = name;
    }

    public int getComfort() {
        return comfort;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public Double getWeightLuggage() {
        return weightLuggage;
    }

    public String getName() {
        return name;
    }
}
