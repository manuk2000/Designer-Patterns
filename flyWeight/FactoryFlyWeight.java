package flyWeight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactoryFlyWeight {
    private static List<FlyWeightCar> arr = new ArrayList<>();

     public static FlyWeightCar getFlyWeight(String firma , String model){
        FlyWeightCar tmp = new FlyWeightCar(firma , model);
        int index;
        if( (index = arr.indexOf(tmp) )!= -1){
            return arr.get(index);
        }
        return tmp;
    }
}
