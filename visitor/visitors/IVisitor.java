package visitor.visitors;

import visitor.peapol.BankPeapol;
import visitor.peapol.IAddedBehevor;
import visitor.peapol.Men;
import visitor.peapol.TeachePeapol;

import java.util.List;

public interface IVisitor {
    //es poschtalion@ pti karena fra banki dasatuo sovorakan qaxaqacu motov u amen mekin ham-pat apahaovagrutyun arajarki

//    void bankVisitor(BankPeapol bank);
//    void teacherVisitor(TeachePeapol bank);
//    void menVisitor(Men bank);
//    void sendNewMessage(List<IAddedBehevor> list);

    void sendNewMessage(List<IAddedBehevor> list);
    void Visitor(BankPeapol bank);

    void Visitor(TeachePeapol bank);

    void Visitor(Men bank);
}
