package src;

public interface Telephone {
    public void makeCall(String phoneNo);
    public void incomingCall(String phoneNo);
    public boolean isRinging();
    public void answer();
    public void isPowerOn();
    public void rejectCall();
}
