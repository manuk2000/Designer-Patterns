package observer.notify;

import observer.subscriber.ISubscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NotifySevis {
    private Map<TypeNotify , ArrayList<ISubscriber>>  list = new HashMap<>();

    public NotifySevis() {
        for (TypeNotify value : TypeNotify.values()) {
            list.put(value , new ArrayList<>());
        }
    }


}
abstract class A {
    abstract foo();
}
