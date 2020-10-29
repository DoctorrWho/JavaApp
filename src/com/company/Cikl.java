package com.company;

public class Cikl {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for(int i = 100; i > 10; i -= 10){
            System.out.println(i);
        }
        //переменные для цыкла while
        System.out.println ("\n");
        boolean isTrue = true;
        int j = 0;
        while(isTrue){
            System.out.println (j);
            if (j >= 10)isTrue = false;
            j++;
        }
        //переменные для цыкла do while - этот цыкл выполнится хотябы один раз даже если условие не верно
        int x = 0;
        System.out.println ("\n");
        do{
            System.out.println(x + " Вывелось один раз при не соответствующем условии");
            x++;
        }while(x < 0);

        //также можно в цыклах использовать операторы "break" "return" - закончат цикл и выйдет из него
        // "continue" - пропускает одну итерацию в цыкле

        System.out.println ("\n");

        int q = 0;
        while(q < 50){
            q += 1;
            if (q % 2 == 0){continue;}
            System.out.println (q);
        }
    }

}
