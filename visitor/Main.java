package visitor;

import visitor.peapol.BankPeapol;
import visitor.peapol.IAddedBehevor;
import visitor.peapol.Men;
import visitor.peapol.TeachePeapol;
import visitor.visitors.BadVisitor;
import visitor.visitors.GoodVisitor;
import visitor.visitors.IVisitor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //create peapol
        IAddedBehevor men = new Men();
        IAddedBehevor  bank= new BankPeapol();
        IAddedBehevor  teacher= new TeachePeapol();

        //cerate Visitors
        IVisitor good = new GoodVisitor();
        IVisitor bad = new BadVisitor();


        good.sendNewMessage(Arrays.asList(men));
        good.sendNewMessage(Arrays.asList(bank));
        good.sendNewMessage(Arrays.asList(teacher));

        men.addBehevor(good);
        bank.addBehevor(bad);


    }
}
