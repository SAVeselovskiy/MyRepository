package npp.homework;

import java.util.Random;

/**
 * Created by Сережа on 16.04.14.
 */
public class Racecar1 extends Racecar {
    public Racecar1() {
        super();
        this.speed = new Random().nextInt(200) + 1;
        this.colour = "Red";
    }

    @Override
    public String toString() {
        return super.toString() + " Скорость = " + speed;
    }

    @Override
    public void ride() {
        super.ride();
    }
}

