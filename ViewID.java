import java.util.ArrayList;

public class ViewID {
    /** Вывод списка ID телефонов  */
    protected static void showID(ArrayList<NextPhone> phones) {
        for (NextPhone phone : phones) {
            System.out.println(phone.getID());
        }
    }
}
