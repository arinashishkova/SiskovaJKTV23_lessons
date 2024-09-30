//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        // Создаем объект Scanner для ввода данных
//        Scanner scanner = new Scanner(System.in);
//
//        // Вводим значение температуры в градусах Цельсия
//        System.out.print("Введите температуру в градусах Цельсия: ");
//        double celsius = scanner.nextDouble();
//
//        // Вычисляем температуру в градусах Фаренгейта
//        double fahrenheit = (celsius * 9 / 5) + 32;
//
//        // Выводим результат
//        System.out.println("Температура по Фаренгейту: " + fahrenheit);
//
//    }
//}

import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Вводим трёхзначное число
        System.out.print("Введите трёхзначное число: ");
        int number = scanner.nextInt();

        // Находим число единиц, десятков и сотен
        int units = number % 10;        // Число единиц
        int tens = (number / 10) % 10;  // Число десятков
        int hundreds = number / 100;    // Число сотен

        // Вычисляем сумму цифр
        int sum = units + tens + hundreds;

        // Выводим результаты
        System.out.println("Число сотен: " + hundreds);
        System.out.println("Число десятков: " + tens);
        System.out.println("Число единиц: " + units);
        System.out.println("Сумма цифр: " + sum);
    }
}