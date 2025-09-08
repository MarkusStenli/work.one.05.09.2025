package ru.otus.java.basic.home.work;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println();
       one();
       two();
       three();
       four();
       five();
        }

        public static void one () {
             for (int i = 1; i <= 3; i++) {
             System.out.println(i + "java");
             }
        }

       public static void two (){
            for (int i = 20; i <= 30; i++) {
                if (i % 2 == 0) {
                System.out.print(" " + i + " " );
                }
            }

        }

        public static void three (){
        for (int j = 1; j <= 10; j++){
            if (j > 2 && j < 8){
                continue;
            }
            System.out.println(j);
        }
        }

        public static void four (){
        for (int m = 0; m < 2; m++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(" " + m + k);
            }
        }
        }

        public static void five (){
            Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt(), max = scanner.nextInt();
        for (int i = min; i <= max; i++){
            System.out.println("PRINT: " + i);
        }

        }

    }
