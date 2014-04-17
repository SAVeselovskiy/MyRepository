package npp.homework;

/**
 * Created by Сережа on 16.04.14.
 */
public class AutomobileFactory {
    public static Automobile1 createCar(String carType){
        if(carType == "Automobile1"){
            return new Automobile1();
        }
        return null;
    }
}
