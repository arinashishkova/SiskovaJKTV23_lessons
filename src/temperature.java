import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Вводим значение температуры в градусах Цельсия
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        // Вычисляем температуру в градусах Фаренгейта
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Выводим результат
        System.out.println("Температура по Фаренгейту: " + fahrenheit);

    }
}