package npp.homework;

/**
 * Created by Сережа on 16.04.14.
 */
public abstract class Truck extends Car {
    protected Truck() {
        super();
    }

    @Override
    public void ride() {
        System.out.println("Поехали!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
