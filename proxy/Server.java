package proxy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Server  implements  Interfacee{
    int x;

    public Server(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;
}
