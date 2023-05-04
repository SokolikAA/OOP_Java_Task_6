import java.util.ArrayList;
import java.util.Scanner;

public class FilterRAM {
    /** Сортировка по объему оперативной памяти телефона  */
    protected static void filterRAM(ArrayList<NextPhone> phones, Scanner sr) {
        System.out.print("Ввевдите минимальное занчение RAM -> ");
        Double minRam = sr.nextDouble();

        for (NextPhone phone : phones) {
            if ((Double) phone.getRAM() >= minRam) {
                System.out.println(phone);
            }
        }
    }
}
