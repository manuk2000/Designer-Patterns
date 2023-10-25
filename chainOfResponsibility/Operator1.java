package chainOfResponsibility;

public class Operator1 extends BaseOberator implements  IOperator{
    @Override
    public boolean query(Responsibly r) {
        //operatori ham-pat giteliqneri depqum kpatasxani che kta miyusin
        return r.isAge() || next.query(r);
    }
    public Operator1(IOperator o){
        super(o);
    }
    public Operator1(){
    }
}
