package observer.subscriber;

public class EmailSubscriber implements ISubscriber{

    @Override
    public void notifysubscriber() {
        System.out.println("EmailSubscriber.notifysubscriber");
    }
}
