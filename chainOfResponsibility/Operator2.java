package chainOfResponsibility;


public class Operator2 extends BaseOberator implements  IOperator{
    @Override
    public boolean query(Responsibly r) {
        //operatori ham-pat giteliqneri depqum kpatasxani che kta miyusin
        return r.isPassword() || next.query(r);
    }
    public Operator2(IOperator o){
        super(o);
    }
    public Operator2(){}
}
