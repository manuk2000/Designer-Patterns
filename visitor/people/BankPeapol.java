package visitor.peapol;

import visitor.visitors.IVisitor;

public class BankPeapol implements IAddedBehevor {

    @Override
    public void addBehevor(IVisitor visitor) {
        visitor.Visitor(this);
    }
}
