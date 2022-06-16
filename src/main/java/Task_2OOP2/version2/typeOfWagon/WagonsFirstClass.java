package Task_2OOP2.version2.typeOfWagon;
public class WagonsFirstClass extends Wagons {
    Food food;

    public WagonsFirstClass(int comfort, int numberOfPassengers, Double weightLuggage, String name, Food food) {
        super(comfort, numberOfPassengers, weightLuggage, name);
        this.food = food;
    }
}
