package observer.subscriber;

public class SMSSubscriber implements ISubscriber{
    @Override
    public void notifysubscriber() {
        System.out.println("SMSSubscriber.notifysubscriber");
    }
}
