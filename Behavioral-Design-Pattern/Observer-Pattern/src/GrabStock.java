public class GrabStock {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer0 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(10.00);
        stockGrabber.setapplePrice(10000.00);
        stockGrabber.setGooglePrice(900.00);

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(150.00);
        stockGrabber.setapplePrice(15000.00);
        stockGrabber.setGooglePrice(700.00);

        stockGrabber.unregister(observer0);

    }
}
