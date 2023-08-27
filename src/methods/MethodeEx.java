package methods;

public class MethodeEx {

    public static void main(String[] args) {

        printName("Larisa"); //apelarea unei

        String myName = createFullName("Larisa", "Blaj");
        System.out.println("Numele meu complet este " + myName);
        System.out.println("Suma numerelor este " + calculateSum(8,5));


    }

    //declararea unei metode
    static void printName(String name) {
        System.out.println(name);

    }

    static String createFullName(String prenume, String nume) {
        String fullName = nume.concat(" ").concat(prenume);
        return fullName;
    }
    static int calculateSum(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }




}
