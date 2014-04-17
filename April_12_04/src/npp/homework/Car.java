package npp.homework;
import java.util.Random;


/**
 * Created by Сережа on 16.04.14.
 */
public abstract class Car implements  Rideable{
    protected String colour;
    protected int id;

    public int getId() {
        return id;
    }

    protected Car() {
        Random rand = new Random();
        this.id = rand.nextInt(5) + 1;
    }

    @Override
    public String toString(){
        return "I'm car! My colour is " + this.colour + " My ID is " + this.id;
    }


}
