package ru.otus.java.basic.home.work;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println();
       one();
       two();
       three();
       four();
       five();
       six();
        }

        public static void one () {
             for (int i = 1; i <= 3; i++) {
             System.out.println("hello");
             }
        }
// первое задание

    public static void two (){
       int[] arr = {4, 6, 2, 5, 9};
       int positiveCounter = 0;
       for (int i = 0; i < arr.length; i++){
           if (arr[i] >= 5){
               positiveCounter ++;
           }
       }
        System.out.println(" количество ячеек выше пяти по значению " + positiveCounter);
    }

    // второе задание

    public static void three (){
       int [] arr = new int [10];
       for (int i = 0; i < 10; i++){
           arr [i] = 1;
       }
        System.out.println(Arrays.toString(arr));
     }
// третье задание

public static void four (){
        int[] arr = new int [8];
        for (int i = 0; i < arr.length; i++){
            arr[i] = 30 + i;
        }
            System.out.println(Arrays.toString(arr));
}
// четвертое задание

    public static void five (){
    int[] arr = new int[10];
    for (int i = 0; i < arr.length / 2; i++){
        arr[i] = 1;
    }
    for (int i = arr.length / 2; i < arr.length; i++){
        arr[i] = 2;
    }
        System.out.println(Arrays.toString(arr));
    }

    public static void six (){
        int [] arr = {1, 4, 5, 6, 7, 2, 2, 4, 2, 3};
        sumAndPrint(arr);
    }
public static void sumAndPrint(int[] in ){
        int sum = 0;
        for (int i = 0; i < in.length/2; i++) {
            sum += in[i];
        }
        int sum2 = 0;
        for (int i = in.length / 2; i < in.length; i++){
            sum2 += in[i];
        }
        if (sum > sum2){
            System.out.println("левая часть массива больше ");
        } else {
            System.out.println("правая часть массива больше");
        }
}
    //пятое задание

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
