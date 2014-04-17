package npp.homework;

import java.util.Random;

/**
 * Created by Сережа on 16.04.14.
 */
public class Racecar2 extends Racecar {
    @Override
    public String toString() {
        return super.toString() + " Скорость = " + this.speed;
    }

    public Racecar2() {
        super();
        this.speed = new Random().nextInt(300) + 1;
        this.colour = "Yellow";
    }

    @Override
    public void ride() {
        super.ride();
    }
}
