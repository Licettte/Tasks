package Task_4MULT;

import java.util.concurrent.locks.ReentrantLock;

public class Auctionist implements Runnable {

    String name;
    Lot lot;
    ReentrantLock lock;

    public Auctionist(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            lock.lock();
            try {
                Thread.sleep(100);

                Double random = Math.random();
                if (lot.getOwner() == this) continue;
                if (lot.getCancelCount() == lot.getNumberOfAuctionists() - 1) return;
                if (random < 0.3) {
                    Integer cancelCount = lot.getCancelCount();
                    lot.setCancelCount(++cancelCount);
                    if (cancelCount == lot.getNumberOfAuctionists() - 1) {
                        return;
                    } else {
                        continue;
                    }
                }

                Double price = lot.getPrice();
                Double priceStep = lot.getPriceStep();

                if (random > 0.8) priceStep *= Math.round(random * 10 - 7);

                Double newPrice = price + priceStep;

                lot.setPrice(newPrice);
                lot.setPriceStep(priceStep);
                lot.setOwner(this);
                lot.setCancelCount(0);

                System.out.println(name + " bet " + newPrice + " for " + lot.getName());

            } catch (InterruptedException e) {
                return;
            } finally {
                lock.unlock();
            }

        }
    }
}
