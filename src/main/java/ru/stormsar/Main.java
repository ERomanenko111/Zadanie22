package ru.stormsar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Считать потоком ввода три числа, введенных пользователем, и сохранить их в целочисленных переменных a, b и c

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //Вывести на консоль переменные, значения которых делятся на 5 (вида: a=25, c=15), если нет ни одного значений, делящегося на 5, вывести строку: "нет значений, кратных 5"

        System.out.println("Вы ввели числа: " + a + ", " + b + ", " + c);

        boolean found = false;

        if (a % 5 == 0) {
            found = true;
            System.out.println("a=" + a);
        }
        if (b % 5 == 0) {
            found = true;
            System.out.println("b=" + b);
        }
        if (c % 5 == 0) {
            found = true;
            System.out.println("c=" + c);
        }

        if (!found) {
            System.out.println("нет значений, кратных 5");
        }

        //Вывести наконсоль значение от целочисленного деления a на b (результат - целое число)
        int result = a / b;

        System.out.println("Результат целочисленного деления a на b: " + result);


        // Вывести на консоль значение от деления a на b (результат - число с плавающей запятой)


        double result1 = ((double) a / b);
        System.out.println("Результат деления a на b: " + result1);

        //Вывести на консоль значение от деления a на b, округленного до ближайшего целого в большую сторону

        double result2 = Math.ceil((double) a / b);

        System.out.println("Результат: " + result2);

        //Вывести на консоль значение от деления a на b, округленного до ближайшего целого в меньшую сторону

        double result3 = Math.floor((double) a / b);
        System.out.println("Результат: " + (int) result3);

        //Вывести на консоль значение от деления a на b, округленного до ближайшего целого математическим округлением

        double result4 = Math.round((double)a / b);
        System.out.println("Результат: " + (int)result4);

        //Вывести на консоль остаток от деления b на c

        int remainder = b % c;

        System.out.println("Остаток от деления: " + remainder);

        //Вывести на консоль наименьшее значение из a и b

        int minValue = Math.min(a, b);

        System.out.println("Наименьшее значение из a и b: " + minValue);

        //Вывести на консоль наибольшее значение из b и c

        int max = Math.max(b, c); // находим максимальное значение из b и c

        System.out.println("Наибольшее значение из b и c: " + max); // выводим результат на консоль

    }
}