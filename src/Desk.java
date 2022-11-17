package src;

public class Desk implements Telephone {
    String myPhoneNo;
    boolean ringing;
    public Desk(String myPhoneNo) {
        this.myPhoneNo=myPhoneNo;
        this.ringing=false;
    }

    @Override
    public void makeCall(String phoneNo) {
        System.out.print("Calling "+ phoneNo);

    }

    @Override
    public void incomingCall(String phoneNo) {
        if(phoneNo ==myPhoneNo){
            ringing=true;
            System.out.println("Incoming call");
        }
        else{
            System.out.println("Wrong number");
        }

    }

    @Override
    public boolean isRinging() {
        if(ringing==true)
        System.out.println("Phone is ringing");
        return ringing;
    }

    @Override
    public void answer() {
       ringing=false;
        System.out.println("Answering the call");
    }

    @Override
    public void isPowerOn() {
        System.out.println("Always on");
    }

    @Override
    public void rejectCall() {
        System.out.println("Reject the call");
        ringing=false;
    }

}
