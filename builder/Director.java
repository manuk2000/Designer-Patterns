package builder;

public class Director {
    Car creqteCarTyperOne (IBuilder b){
        BuilderCar car;
                car = new BuilderCar("veadev");
                car.setColor("karmr");
                car.setDiauj(12);
                car.setTari(123);
                return car.builder();
    }

    Car creqteCarTyperTwo (IBuilder b){
        BuilderCar car;
        car = new BuilderCar("banan");
        car.setColor("kaput");
        car.setDiauj(123);
        car.setTari(1);
        return car.builder();
    }
}
