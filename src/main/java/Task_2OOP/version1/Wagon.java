package Task_2OOP.version1;

public class Wagon {
    private final Comfort comfortType;
    private final int comfort;
    private final int numberOfPassengers;
    private final Double weightLuggage;
    private final String name;
    private Food food;
    public Wagon(WagonBuilder builder) {
        this.comfortType = builder.comfortType;
        this.comfort = builder.comfort;
        this.numberOfPassengers = builder.numberOfPassengers;
        this.weightLuggage = builder.weightLuggage;
        this.name = builder.name;

        if (comfortType.equals(Comfort.FIRSTCLASS)) {
            this.food = builder.food;
        }
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

    @Override
    public String toString() {
        return "Wagon{" +
                "comfortType=" + comfortType +
                ", comfort=" + comfort +
                ", numberOfPassengers=" + numberOfPassengers +
                ", weightLuggage=" + weightLuggage +
                ", name='" + name + '\'' +
                ", food=" + food +
                '}';
    }

    public static class WagonBuilder {
        private final Comfort comfortType;
        private final int comfort;
        private final int numberOfPassengers;
        private final Double weightLuggage;
        private String name;
        private Food food;

        public WagonBuilder(Comfort comfortType, int comfort, int numberOfPassengers, Double weightLuggage) {
            this.comfortType = comfortType;
            this.comfort = comfort;
            this.numberOfPassengers = numberOfPassengers;
            this.weightLuggage = weightLuggage;
        }
        public WagonBuilder name(String name) {
            this.name = name;
            return this;
        }
        public WagonBuilder food(Food food) {
            this.food= food;
            return this;
        }

        public Wagon build() {

            Wagon wagon = new Wagon(this);
            doQualityCheck(wagon);
            return wagon;
        }
        public boolean doQualityCheck(Wagon wagon) {
            return (comfort != 0 && comfort <= 3) && (weightLuggage >= 0)&&(numberOfPassengers>=0);
        }
    }
}
