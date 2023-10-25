package adapter;

import java.util.Arrays;

public class XML implements IAdapter{
    private StringBuilder[] arr = new StringBuilder[12];
    private int size = 0;
    public void set(CharSequence s){
        arr[size].append(s.toString());
    }
    public String getAt(int index){
        return arr[index].toString();
    }

    @Override
    public String toString() {
        return "XML{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
