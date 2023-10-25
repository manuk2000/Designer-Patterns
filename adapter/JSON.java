package adapter;

import java.util.Arrays;

public class JSON {
    private StringBuilder[] arr = new StringBuilder[12];
    private int size = 0;
    public void setJson(CharSequence s){
        arr[size].append("++" + s.toString() + "++");
    }

    @Override
    public String toString() {
        return "JSON{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public String getAtJson(int index){
        return arr[index].toString();
    }
}
