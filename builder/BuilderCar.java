package builder;

public class BuilderCar implements IBuilder {
    private final String typeEngine;
    private String color;
    private int diauj;
    private int tari;

    public BuilderCar(String typeEngine) {
        this.typeEngine = typeEngine;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void setDiauj(int diauj) {
        this.diauj = diauj;
    }
    @Override
    public void setTari(int tari) {
        this.tari = tari;
    }
    @Override
    public Car builder (){
        return new Car(typeEngine,color,diauj,tari);
    }
}
