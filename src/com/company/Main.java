package com.company;
import java.lang.String;
import java.util.Scanner;
        //*
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        System.out.println("End");

        //Переменные

        byte num = 23; //число от -128 до 127
        int num_1 = 7808737;
        float num_2 = 23.45f; //число с плавающей точкой в конце надо ставить f
        double num_3 = 23.1546874548674357486d; //число с плавающей точкой в конце надо ставить d только больше

        boolean isTrue = true;
        char sym = 'R';// можно запиcать только один символ

        String str = "Hello People";

        System.out.println(num);
        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);

        System.out.println(isTrue);
        System.out.println(sym);

        System.out.println(str);

        //Принимаем данные от пользователя
            Scanner str_1 = new Scanner(System.in);

            System.out.println("Вы ввели строку: " + str_1.nextLine());

    }
}
