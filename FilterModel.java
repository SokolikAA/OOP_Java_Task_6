import java.util.ArrayList;
import java.util.Scanner;



public class FilterModel {
    /** Сортировка по модели телефона  */
    protected static void filterModel(ArrayList<NextPhone> phones, Scanner sr) {
        System.out.print("Ввевдите нименование модели -> ");
        String variable = sr.nextLine().toLowerCase();
        for (NextPhone phone : phones) {
            if (phone.getModelName().toLowerCase().equals(variable)) {
                System.out.println(phone);
            }
        }
    }
}
