package chainOfResponsibility;

public class BaseOberator implements IOperator {
    IOperator next;

    public BaseOberator(IOperator next) {
        this.next = next;
    }
    public BaseOberator(){}


    @Override
    public boolean query(Responsibly r) {
        if(next == null){
            return false;
        }
        return next.query(r);
    }
}
