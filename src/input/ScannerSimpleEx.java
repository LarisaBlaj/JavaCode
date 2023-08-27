package input;

import java.util.Scanner;

public class ScannerSimpleEx {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Te rog introdu de la tastatura un text");
        String inputFromUser = scan.nextLine(); // se citeste textul introdus de utilizator de la tastatura si
        System.out.println(inputFromUser.toUpperCase());

        System.out.println("Te rog sa afisezi un numar intreg");
        byte byteNumberFromUser = scan.nextByte();



        System.out.println("Te rog introdu un numar intreg");
        int intNumberFromUser = scan.nextInt();
        System.out.println(intNumberFromUser + byteNumberFromUser);

        System.out.println("Te rog introdu un numar cu virgula");
        double doubleNumberFromUser = scan.nextDouble();
        System.out.println(doubleNumberFromUser);

        System.out.printf("%.2f\n", doubleNumberFromUser);



    }
}
