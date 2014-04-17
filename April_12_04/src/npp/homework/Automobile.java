package npp.homework;

/**
 * Created by Сережа on 16.04.14.
 */
public abstract class Automobile extends Car {
    protected Automobile() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void ride() {
        System.out.println("Поехали!");
    }
}
