package n1exercici1;

public class Main {
    public static void main(String[] args) {
        StockExchange stockMarket = new StockExchange();

        stockMarket.addObserver(new Agencies("Brokers"));
        stockMarket.addObserver(new Agencies("Finances"));
        stockMarket.addObserver(new Agencies("Cooper"));

        stockMarket.marketChange(true);
        stockMarket.marketChange(false);

    }

}
