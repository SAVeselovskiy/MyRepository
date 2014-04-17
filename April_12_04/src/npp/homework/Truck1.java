package npp.homework;

/**
 * Created by Сережа on 16.04.14.
 */
public class Truck1 extends Truck {
    public Truck1() {
        super();
        this.colour = "Black";
    }

    @Override
    public void ride() {
        super.ride();
    }

    @Override
    public String toString() {
        return super.toString() + " + Дополнительная информация =Ъ";
    }
}
