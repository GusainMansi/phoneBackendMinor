package src;

public class Main {
    public static void main(String args[]){
Desk d1= new Desk("12345");
Desk d2= new Desk("54321");

        /** d1.incomingCall("233545");
if(d1.isRinging()==true){
    d1.answer();
}
else{
    System.out.println("No incoming call or " +
            "wrong number");
} **/
        d1.makeCall("54021");
        d2.incomingCall("54021");
        if(d2.isRinging()==true){
            d2.answer();
        }


/**mobile m=new mobile("1234");
m.isPowerOn();
m.incomingCall("1234");
if(m.isRinging()==true){
    m.answer();
}
else{
    System.out.println("No incoming call or " +
            "wrong number");
} ***/
}}
