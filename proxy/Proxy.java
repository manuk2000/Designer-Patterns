package proxy;

public class Proxy implements  Interfacee{
    private Server s;
    int countQuery = 0;

    public Proxy(int x , int y) {
        this.s = new Server(x,y);
    }

    @Override
    public int getX() {
        countQuery++;
        return s.getX();

    }

    @Override
    public void setX(int x) {
        countQuery++;
        s.setX(x);
    }

    @Override
    public int getY() {
        countQuery++;
        return s.getY();
    }

    @Override
    public void setY(int y) {
        countQuery++;
        s.setY(y);
    }
}
