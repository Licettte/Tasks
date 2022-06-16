package Task_4MULT;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class Auction {
    private List<Lot> lots = new ArrayList<>();
    private List<Auctionist> auctionists = new ArrayList<>();
    private ReentrantLock lock = new ReentrantLock();
    public List<Lot> getLots() {
        return lots;
    }
    public List<Auctionist> getAuctionists() {
        return auctionists;
    }
    public static void main(String[] args) throws InterruptedException {

        Auction auction = new Auction();

        auction.getAuctionists().add(new Auctionist("Alice", auction.lock));
        auction.getAuctionists().add(new Auctionist("Bob", auction.lock));
        auction.getAuctionists().add(new Auctionist("Carol", auction.lock));

        int numberOfAuctionist = auction.getAuctionists().size();

        auction.getLots().add(new Lot("Picture", 10_000.0, numberOfAuctionist));
        auction.getLots().add(new Lot("Statue", 4_000.0, numberOfAuctionist));

        List<Thread> threads = new ArrayList<>();

        Logger log = Logger.getLogger(Auction.class.getName());

        for (Lot lot : auction.getLots()) {

            log.info("Start auction for " + lot.getName());
            threads.clear();

            for (Auctionist auctionist : auction.getAuctionists()) {
                auctionist.setLot(lot);
                Thread thread = new Thread(auctionist);
                threads.add(thread);
                thread.start();
            }

            Thread.sleep(1000);

            for (Thread thread : threads) {
                thread.interrupt();
                thread.join();
            }

            if (lot.getOwner() == null) System.out.println(lot.getName() + " was cancelled");
            else {
                log.info(lot.getName() + " was sold to " + lot.getOwner().getName() + " for $" + lot.getPrice());
            }
        }
    }
}
