package visitor.peapol;

import visitor.visitors.IVisitor;

public class Men implements IAddedBehevor{
    @Override
    public void addBehevor(IVisitor visitor) {
        visitor.Visitor(this);
    }
}
