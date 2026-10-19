public class smsFacade {
    ISystem sender = new messageSender();
    ISystem sms_center = new smsCenter();
    ISystem recipient = new messageRecipient();
    public void executeMessage() {
        System.out.println("Simple SMS work system");
        System.out.println("Sender job:");
        sender.work();
        System.out.println("SMS Center job:");
        sms_center.work();
        System.out.println("Result (recipient):");
        recipient.work();
    }
}
