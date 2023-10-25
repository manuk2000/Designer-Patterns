package adapter;

public class AdapterJson extends JSON implements IAdapter{
    @Override
    public void set(CharSequence s) {
        setJson(s);
    }

    @Override
    public String getAt(int index) {
        return getAtJson(index);
    }
}
