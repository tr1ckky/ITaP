package lab2;

public class Main {
    public static void main(String[] args) {
        // Цилиндр
        cylinder clndr = new cylinder(10, 5);
        clndr.setName("Цилиндр");

        clndr.GetInfo();  // Демонстрация базовой версии GetInfo
        clndr.GetInfo("демонстрация статического полиморфизма");  // Перегруженная версия
        System.out.println("Радиус: " + clndr.getRadius());
        System.out.println("Площадь поверхности: " + clndr.GetS());
        System.out.println("Объём: " + clndr.GetV());

        System.out.println("Изменяем высоту и пересчитываем:");
        clndr.setHeight(6);
        System.out.println("Новая площадь: " + clndr.GetS());
        System.out.println("Новый объём: " + clndr.GetV() + "\n");

        // Шар
        circle crcl = new circle("чёрный", 10);
        crcl.setName("Шар");

        crcl.GetInfo();  // Override базовой
        crcl.GetInfo("демонстрация статического полиморфизма");  // Override перегруженной
        System.out.println("Площадь поверхности: " + crcl.GetS());
        System.out.println("Объём: " + crcl.GetV() + "\n");

        // Параллелепипед
        square sqr = new square(10, 5, 1);
        sqr.setName("Параллелепипед");

        sqr.GetInfo();  // Базовая от figure
        sqr.GetInfo("демонстрация статического полиморфизма");  // Перегруженная
        System.out.println("Количество созданных параллелепипедов: " + square.squareCounter);
        System.out.println("Площадь поверхности: " + sqr.GetS());
        System.out.println("Объём: " + sqr.GetV() + "\n");

        System.out.println("Создаём ещё один параллелепипед и проверяем счётчик:");
        square sqr2 = new square();
        System.out.println("Количество созданных параллелепипедов: " + square.squareCounter);
    }
}
