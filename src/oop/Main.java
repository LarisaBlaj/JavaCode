package oop;

import oop.staticmethod.MyPrinter;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(PI);

        MyPrinter.printNumber(10);
        System.out.println("--------------------------------------------------");
        System.out.println(MyPrinter.formatTime(3732));
        System.out.println(MyPrinter.formatTime(59778));
    }
}
