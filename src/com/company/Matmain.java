package com.company;
import java.util.Scanner;

public class Matmain {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int first, second, result;  //при делении лучше использовать тип даннх типа float
        System.out.print("Введи первое число: ");
        first = num.nextInt(); // если float то меняем на num.nextFloat()
        System.out.print("Введи второе число: ");
        second = num.nextInt();
        result = first + second; //можно "-" "*" "/" при делении лучше использовать тип даннх типа float
        System.out.println("Сумма введенных чисел равна: " + result);
        result += 2; //сокращенная запись также и при "-" "*" "/"
        result++; //сокращенная запись прибавления еденицы также и при "-"

        int result1 = first % second; //% выводит остаток при делении
        System.out.println("Остаток при делении равен: " + result1);
        System.out.println("Результат после доп манипуляций: " + result);
        System.out.println("Вот как-то так");

    }
}
