package adapter;

public class Consumer {
    public static void main(String[] args) {
        IAdapter xml = new XML();
        xml.set("frst");
        xml.getAt(0);

        IAdapter json = new AdapterJson();
        xml.set("frst");
        xml.getAt(0);

    }
}
