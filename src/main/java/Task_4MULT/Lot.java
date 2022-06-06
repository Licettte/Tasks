package Task_4MULT;

import java.util.concurrent.locks.ReentrantLock;

public class Lot {
    private static final double INITIAL_PRICE_STEP = 0.1;

    private int numberOfAuctionists;
    String name;
    Double initialPrice;
    Double price;
    Double priceStep;

    Integer cancelCount = 0;
    Auctionist owner = null;

    ReentrantLock locker = new ReentrantLock();

    public int getNumberOfAuctionists() {
            return numberOfAuctionists;
    }

    public Integer getCancelCount() {
            return cancelCount;
    }

    public void setCancelCount(Integer cancelCount) {
        this.cancelCount = cancelCount;
    }

    public String getName() {
            return name;
    }

    public Double getPrice() {
            return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPriceStep() {
            return priceStep;
    }

    public void setPriceStep(Double priceStep) {
        this.priceStep = priceStep;
    }

    public Auctionist getOwner() {
            return owner;
    }

    public void setOwner(Auctionist owner) {
        this.owner = owner;
    }

    public Lot(String name, Double initialPrice, Integer numberOfAuctionists) {
        this.name = name;
        this.initialPrice = initialPrice;
        this.price = initialPrice;
        this.numberOfAuctionists = numberOfAuctionists;
        priceStep = price * INITIAL_PRICE_STEP;
    }
}
