package factoryMethod;

public abstract class AFactory {
    abstract Developer createProduct();
}
class APraductFactory extends  AFactory{
    static int countCreatThisObj = 0;
    @Override
    Developer createProduct() {
        countCreatThisObj++;
        return new CDeveloper();
    }
}
class BPraductFactory extends  AFactory{
    static int countCreatThisObj = 0;
    @Override
    Developer createProduct() {
        countCreatThisObj++;
        return new JavaDeveloper();
    }
}