
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ArrayList<NextPhone> phones = new ArrayList<>();
        phones.add(new NextPhone("Nokia", 1538945, 3.0, 4, 2500, "red"));
        phones.add(new NextPhone("Samsung", "DA1534325", 4.5, 6, 3500, "black"));
        phones.add(new NextPhone("Lenovo", "00124588", 3.2, 4, 3000, "silver"));
        phones.add(new NextPhone("Xiaomi", 9951477, 5.2, 6, 4000, "black"));
        phones.add(new NextPhone("IPhone", 7777777, 2.4, 4, 1500, "silver"));

        Scanner sr = new Scanner((System.in));
        boolean command = true;
        while (command) {
            System.out.println("""
                    Введите соответствующий пункт меню, по которому хотите сделать выбор:\s
                    Модель - 1
                    ID - 2
                    RAM - 3
                    Число ядер - 4
                    Батарея - 5
                    Цвет - 6
                    Посмотреть все модели - 7
                    Выход из меню - 0
                    ->""");

            String operation = sr.nextLine();

            switch (operation) {
                case "1" -> FilterModel.filterModel(phones, sr);
                case "2" -> ViewID.showID(phones);
                case "3" -> FilterRAM.filterRAM(phones, sr);
                case "4" -> FilterCore.filterCore(phones, sr);
                case "5" -> FilterBattery.filterBattery(phones, sr);
                case "6" -> FilterColor.filterColor(phones, sr);
                case "7" -> ShowCatalog.showCatalog(phones);
                case "0" -> {
                    System.out.println("До новых встреч!");
                    command = false;
                }
                default -> {
                    System.out.println("Введена неправильная операция");
                    System.out.println();
                }
            }
        }
    }
}
