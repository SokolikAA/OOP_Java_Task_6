import java.util.ArrayList;

public class ShowCatalog {
    /** Вывод полного списка телефонов */
    protected static void showCatalog(ArrayList<NextPhone> phones) {
        System.out.println();
        System.out.println("Полный каталог телефонов: ");
        System.out.println();
        for (NextPhone nextPhone : phones) {
            System.out.println(nextPhone.toString());
        }
    }
}
