import java.util.ArrayList;
import java.util.Scanner;

public class FilterColor {
    /** Сортировка по необходимому цвету */
    protected static void filterColor(ArrayList<NextPhone> phones, Scanner sr) {
        System.out.print("Ввевдите цвет -> ");
        String variable = sr.nextLine().toLowerCase();
        for (NextPhone phone : phones) {
            if (phone.getColor().equals(variable)) {
                System.out.println(phone);
            }
        }
    }
}
