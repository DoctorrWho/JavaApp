package com.company;

public class ForDima {
    public static void main(String[] args) {

        System.out.println("Projekt For Dima!\n");
        int Stroka = 5;
        for(int i = 0; i < Stroka; i++){
                for(int j = 0; j < i; j++){
                        for(int k = j; k < 1; k++){
                            System.out.print("X");
                        }
                System.out.print(" ");
                }
        System.out.println("X");
        }

    }
}
