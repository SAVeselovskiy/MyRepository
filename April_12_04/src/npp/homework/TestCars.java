package npp.homework;
import java.util.Scanner;
/**
 * Created by Сережа on 16.04.14.
 */
public class TestCars {
    public static void main(String[] args) {
        AutomobileSalon salon = new AutomobileSalon();
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        salon.printCars(salon.findCarsById(id));
        scan.close();
    }

}
