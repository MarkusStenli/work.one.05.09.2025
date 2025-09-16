package ru.otus.java.basic.home.work;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println();
       one();
       two();
       three();
       four();
        // five();
        }

        public static void one () {
             for (int i = 1; i <= 3; i++) {
             System.out.println("hello");
             }
        }
// первое задание (finish)

    public static void two (){
        int[] arr = new int [5];
        arr [2] = 10;
        arr [4] = 5;
        arr [3] = arr [2] + arr [4];
        System.out.println(arr[3]);
        //   System.out.println(Arrays.toString(arr));
    }

    // второе задание

    public static void three (){
       int [] arr = new int [10];
       for (int i = 0; i < 10; i++){
           arr [i] = 1;
       }
        System.out.println(Arrays.toString(arr));
     }
// третье задание (finish)

//    public static void four () {
//        int [] arr = {1, 2, 3, 2, 1};
//int [] array = new int [6];
//        System.out.println (Arrays.toString(arr));
//     }

public static void four (){
        int[] arr = new int [8];
        for (int i = 0; i < arr.length; i++){
            arr[i] = 30 + i;
        }
            System.out.println(Arrays.toString(arr));
}
// четвертое задание (готово)

//       public static void two (){
//            for (int i = 20; i <= 30; i++) {
//                if (i % 2 == 0) {
//                System.out.print(" " + i + " ");
//                }
//            }
//
//        }

//        public static void three () {
//            for (int j = 1; j <= 10; j++ ) {
//                if (j <= 4 ) { continue; }
//                    // if (j > 2 && j < 8){
//                    //       continue; // нужно для пропуска данной задачи
//                System.out.println(j); }
//
//    }


//        public static void four (){
//        for (int m = 0; m < 2; m++) {
//            for (int k = 0; k < 5; k++) {
//                System.out.print(" " + m + k);
//                System.out.println(" ");
//            }
//        }
//        }

//        public static void five (){
//            Scanner scanner = new Scanner(System.in);
//        int min = scanner.nextInt(), max = scanner.nextInt();
//        for (int i = min; i <= max; i++){
//            System.out.println("PRINT: " + i);
//        }
//
//        }


    }
