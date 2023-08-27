package exercitii2;

import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Please provide your number: ");
            n = scanner.nextInt();
            if (n < 0) {

                System.out.println("This is a negative number ! ");
                System.out.println("1.Provide a new number.");
                System.out.println("2.Turn this number into a positive one.");
                int option = scanner.nextInt();
                if(option == 1){
                    continue;
                }
               else{
                   n = n * (-1);
                }
            }

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("FizBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 7 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }


            }
        } while( n < 0);
    }
}
