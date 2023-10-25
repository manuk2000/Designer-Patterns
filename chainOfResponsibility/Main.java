package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        IOperator o1 = new Operator1();
        IOperator o2 = new Operator2(o1);
        IOperator o3 = new OperatorEnd(o2);

        o1.query(new Responsibly(34 , "Gago" , "1234"));
    }
}
