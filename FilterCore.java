import java.util.ArrayList;
import java.util.Scanner;

public class FilterCore {
    /** Сортировка по числу ядер процессора телефона  */
    protected static void filterCore(ArrayList<NextPhone> phones, Scanner sr) {
        System.out.print("Ввевдите минимальное число ядер -> ");
        int minCore = sr.nextInt();

        for (NextPhone phone : phones) {
            if (phone.getCore() >= minCore) {
                System.out.println(phone);
            }
        }
    }
}
