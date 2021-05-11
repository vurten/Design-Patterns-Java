
/*
    State Pattern dynamically changing the class based of different action being performed
*/

public interface ATMState {

    public void insertCard();
    public void ejectCard();
    public void insertPin(int pinEntered);
    public void requestCash(int cashToWithdraw);

}
