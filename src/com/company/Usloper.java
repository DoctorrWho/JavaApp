package com.company;
import java.util.Scanner;

public class Usloper {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = true;
        System.out.print("Введите первое число: ");
        first = num.nextInt();

        isTrue = first == 50 ? true : false;

        if (first >= second && isTrue) {//можно "==" "<="     && - как "и", || - как "или"
            System.out.print("Введенное число ,больше либо равно " + second);
            System.out.print("\n");
        } else if(first == 45) {
            System.out.println("Введенное число: 45");
        } else{
            System.out.println("Введенное число, не равно " + second);
        }

        switch(first){
            case 51:
                System.out.println("Введенное число: 51");
                break;
            case 48:
                System.out.println("Введенное число: 48");
                break;
            case 57:
                System.out.println("Введенное число: 57");
                break;

            default:
                System.out.println("Введенное число " + first + " не из списка CASE.");
        }
    }

}
