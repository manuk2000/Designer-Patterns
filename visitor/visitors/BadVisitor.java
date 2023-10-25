package visitor.visitors;

import visitor.peapol.BankPeapol;
import visitor.peapol.IAddedBehevor;
import visitor.peapol.Men;
import visitor.peapol.TeachePeapol;

import java.util.List;

public class BadVisitor implements IVisitor {
    public void sendNewMessage(List<IAddedBehevor> list){
        list.forEach((peapol) -> {
            peapol.addBehevor(this);
        });
    }
    @Override
    public void Visitor(BankPeapol bank) {
        System.out.println("Bank is bad");
    }

    @Override
    public void Visitor(TeachePeapol bank) {
        System.out.println("Teacher is bad");
    }

    @Override
    public void Visitor(Men bank) {
        System.out.println("Men is bad");
    }
}
