import java.util.ArrayList;
import java.util.Scanner;

public class FilterBattery {
    /** Сортировка по объему батареи телефона  */
    protected static void filterBattery(ArrayList<NextPhone> phones, Scanner sr) {
        System.out.print("Ввевдите минимальный размер батареи -> ");
        int minBatteryCapacity = sr.nextInt();

        for (NextPhone phone : phones) {
            if (phone.getBatteryCapacity() >= minBatteryCapacity) {
                System.out.println(phone);
            }
        }
    }
}
