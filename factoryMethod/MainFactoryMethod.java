package factoryMethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        AFactory factory = new APraductFactory();
        Developer cDeveloper = factory.createProduct();
        cDeveloper.coding();

        factory = new BPraductFactory();
        Developer javaDeveloper = factory.createProduct();
        javaDeveloper.coding();

    }
}
