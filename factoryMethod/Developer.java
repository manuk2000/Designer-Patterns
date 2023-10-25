package factoryMethod;

public interface Developer {
    void coding();
    void tiching();
}
class CDeveloper implements  Developer{

    @Override
    public void coding() {
        System.out.println("coding C");
    }

    @Override
    public void tiching() {
        System.out.println("tiching c");
    }
}

class JavaDeveloper implements  Developer{

    @Override
    public void coding() {
        System.out.println("coding java");
    }

    @Override
    public void tiching() {
        System.out.println("tiching java");
    }
}