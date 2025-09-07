package ru.otus.java.basic.home.work;

public class Application {
    public static void main(String[] args) {
       one();
       two();
        }

        public static void one () {
             for (int i = 1; i <= 3; i++) {
             System.out.println(i + "java");
             }
        }

        public static void two (){
            for (int i = 1; i <= 10; i++) {
                if (i > 3 && i < 9) {
                    continue;
                }
                System.out.println(i);
            }

        }

    }
