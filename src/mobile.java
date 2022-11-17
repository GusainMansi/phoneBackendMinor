package src;

public class mobile implements Telephone{
    String myPhoneNo;
    boolean ringing;
    boolean power;
    public mobile(String myPhoneNo) {
        this.myPhoneNo=myPhoneNo;
        this.ringing=false;
        this.power=false;
    }

    @Override
    public void makeCall(String phoneNo) {
        System.out.print("Calling "+ phoneNo);
    }

    @Override
    public void incomingCall(String phoneNo) {
        if(power==true && phoneNo ==myPhoneNo){
            ringing=true;
            System.out.println("Incoming call");
        }
        else{
            System.out.println("Wrong number");
        }

    }

    @Override
    public boolean isRinging() {
        if(power==true && ringing==true)
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
        this.power=true;
        System.out.println("Mobile is sw" +
                "itched on");

    }

    @Override
    public void rejectCall() {
        System.out.println("Reject the call");
        ringing=false;
    }

}


