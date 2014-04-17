package npp.homework;

/**
 * Created by Сережа on 16.04.14.
 */
public class TruckFactory {
    public static Truck1 createCar(String carType){
        if(carType == "Truck1"){
            return new Truck1();
        }
        return null;
    }
}
