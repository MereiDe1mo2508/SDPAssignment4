public class smsCenter implements ISystem {
    @Override
    public void work() {
        System.out.println("Cell tower getting message from sender \nCell tower sending to SMS Center \nSMS Center finding who's the recipient and what's their range \nSending to another close cell tower");
    }
}
