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
            System.out.println(x);
            x++;
        }while(x < 0);
    }

}
