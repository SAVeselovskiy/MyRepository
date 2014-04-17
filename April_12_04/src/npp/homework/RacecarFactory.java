package npp.homework;

/**
 * Created by Сережа on 16.04.14.
 */
public class RacecarFactory {
    public static Racecar createCar(String carType){
        if(carType == "Racecar1"){
            return new Racecar1();
        }
        else if(carType == "Racecar2"){
            return new Racecar2();
        }
        else{
            return null; //bad line
        }
    }
}
