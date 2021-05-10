import java.util.ArrayList;

public class StockGrabber implements  Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer" + (observerIndex) + " is deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers){
            observer.update(ibmPrice, applePrice, googlePrice);
        }
    }

    public void setIbmPrice(double newIbmPrice){
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }
    public void setapplePrice(double newApplePrice){
        this.applePrice = newApplePrice;
        notifyObserver();
    }
    public void setGooglePrice(double newGooglePrice){
        this.googlePrice = newGooglePrice;
        notifyObserver();
    }
}
