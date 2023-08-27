package arrays;

public class ArrayIterration {

    public static void main(String[] args) {
        int[] myIntArray = {5, -1, 0, 6, 10};

        //printarea fiecarui element din array
        for (int i = 0; i <= myIntArray.length - 1; i++) {

            System.out.println("Elementul de pe pozitia " + i + " este: " + myIntArray[i]);
        }

        for (int i = myIntArray.length - 1; i >= 0; i--) {
            System.out.println("Elementul de pe pozitia " + i + " este: " + myIntArray[i]);
        }

        String[] stringArray = {"sda", "Larisa", "albastru", "azi"};

        findHowManyCharactersAreInStringArray(stringArray);

        System.out.println("Media aritmetica a numerelor din array este: " + calculateAverageOf(myIntArray));


    }

    static void findHowManyCharactersAreInStringArray(String[] words) {
        int sumOfCharacter = 0;
        for (int i = 0; i <= words.length - 1; i++) {
            sumOfCharacter = sumOfCharacter + words[i].length();
        }
        System.out.println("Numarul total de caractere la un loc este " + sumOfCharacter);


    }

    static int calculateAverageOf(int[] myArray) {
        int sum = 0;
        for (int i = 0; i <= myArray.length - 1; i++) {
            sum = sum + myArray[i];
        }
        return sum / myArray.length;

    }
}
