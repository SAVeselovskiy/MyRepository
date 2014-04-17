package npp.homework;

/**
 * Created by Сережа on 16.04.14.
 */
public class Automobile1 extends Automobile {
    public Automobile1() {
        super();
        this.colour="Grey";
    }

    @Override
    public String toString() {
        return super.toString() + " + Дополнительная информация =Ъ";
    }

    @Override
    public void ride() {
        super.ride();
    }
}
