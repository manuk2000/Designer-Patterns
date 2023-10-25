package flyWeight;

public class Car {
    FlyWeightCar firmaAndModel;
    int diauj;

    public Car(int diauj, int weight ,String firma , String model) {
        firmaAndModel = FactoryFlyWeight.getFlyWeight(firma , model);
        this.diauj = diauj;
        this.weight = weight;
    }

    int weight;
}
