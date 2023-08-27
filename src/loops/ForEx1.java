package loops;

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduceti numarul de nivele pentru calculul cuburilor");
        int intNumberFromUser = scan.nextInt();
        int levels = intNumberFromUser;

        for(int i= 1; i<= intNumberFromUser; i++) {
            result = result + i * i; // result += i*i;

        }
        System.out.println(result);
    }
}
