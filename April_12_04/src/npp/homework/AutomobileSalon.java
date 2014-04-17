package npp.homework;

import java.util.ArrayList;
import java.util.Random;
/**
 * Created by Сережа on 16.04.14.
 */
public class AutomobileSalon {
    ArrayList<Racecar> raceCars1;// = new ArrayList<Racecar>(10);
    ArrayList<Racecar> raceCars2;
    ArrayList<Truck> trucks;
    ArrayList<Automobile1> automobiles;

    public AutomobileSalon() {
        int raceCars1Size = new Random().nextInt(5);

        if(raceCars1Size>0){
        	//System.out.println("size>0");
            raceCars1=new ArrayList<Racecar>();
        }
        for(int i = 0; i <raceCars1Size; i++){
            Racecar temp = RacecarFactory.createCar("Racecar1");
            raceCars1.add(i, temp);
        }

        int raceCars2Size = new Random().nextInt(7);
        if(raceCars2Size>0){
            raceCars2 = new ArrayList<Racecar>();
        }
        for(int i = 0; i <raceCars2Size; i++){
            Racecar temp = RacecarFactory.createCar("Racecar2");
            raceCars2.add(i, temp);
        }

        int trucksSize = new Random().nextInt(4);
        if(trucksSize>0){
            trucks = new ArrayList<Truck>();
        }
        for(int i = 0; i <trucksSize; i++){
            Truck1 temp = TruckFactory.createCar("Truck1");
            trucks.add(i,temp);
        }

        int automobileSize = new Random().nextInt(15);
        if(automobileSize>0){
            automobiles = new ArrayList<Automobile1>();
        }
        for(int i = 0; i <automobileSize; i++){
            Automobile1 temp = AutomobileFactory.createCar("Automobile1");
            automobiles.add(i, temp);
        }
    }


    public ArrayList<Car> findCarsById(int id){
        ArrayList<Car> result = new ArrayList<Car>();

        Car temp;
        int index = 0;
        while(raceCars1 != null && index < raceCars1.size() ){
        	if((temp = raceCars1.get(index)).getId() == id){
        		result.add(temp);
        	}
            index++;
        }
        index = 0;
        while(raceCars2 != null && index < raceCars2.size() ){
        	if((temp = raceCars2.get(index)).getId() == id){
        		result.add(temp);
        	}
            index++;
        }
        index = 0;
        while(trucks != null && index < trucks.size() ){
        	if((temp = trucks.get(index)).getId() == id){
        		result.add(temp);
        	}
            index++;
        }

        index = 0;
        while(automobiles != null && index < automobiles.size() ){
        	if((temp = automobiles.get(index)).getId() == id){
        		result.add(temp);
        	}
            index++;
        }

        return result;
    }

    public void printCars(ArrayList<Car> mustBePrinted){
        for( int i = 0; i < mustBePrinted.size(); i++){
            System.out.println(mustBePrinted.get(i));
        }
    }
}
