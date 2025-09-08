package ru.otus.java.basic.home.work;

public class Application {
    public static void main(String[] args) {
        System.out.println();
       one();
       two();
       three();
        }

        public static void one () {
             for (int i = 1; i <= 3; i++) {
             System.out.println(i + "java");
             }
        }

       public static void two (){
            for (int i = 20; i <= 50; i++) {
                if (i % 2 == 0) {
                System.out.println(i);
                }
            }

        }

        public static void three (){
        for (int j = 1; j <= 10; j++){
            if (j > 4 && j < 8){
                continue;
            }
            System.out.println(j);
        }
        }

    }
