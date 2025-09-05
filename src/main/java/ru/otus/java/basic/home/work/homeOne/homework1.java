package ru.otus.java.basic.home.work.homeOne;

public class homework1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println("Hello World!");
        greetings();
        checkSign();
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(2,6,true);
    }
    public static void greetings(){
        System.out.println("Hello \nWorld \nfrom \nJava");
    }

    public static void checkSign() {
        int a = 1;
        int b = -3;

        int c = 1;
        int sum = a + b + c;
        //if (sum == 0 || sum > 0)
        if (sum >= 0)
        {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 5;
        int a = 10;
        int b = 20;
        int c = 30;
        //  int sum = a + b + c;
        if (data <= a) {
            System.out.println("красная");
        }
        if (data <= b && !(data < a)) {
            System.out.println("желтая");
        }
        if (data <= c && !(data < b)) {
            System.out.println("зеленая");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 1;
        int sum = a + b;
        if (sum % a < b) {
            System.out.println(" a < b ");
        } else {
            System.out.println(" a > b ");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int sum = initValue + delta;
        if ( increment == false) {
            System.out.println( initValue + delta );
        } else {
            System.out.println( initValue - delta );
        }
    }

}
