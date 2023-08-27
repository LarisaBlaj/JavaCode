package arrays;

public class StringArray2D {
    public static void main(String[] args) {

        String[][] myStringArray = {{"matematica", "engleza", "informatica"}, {"Ion", "Maria"}, {"ala", "bala", "porto", "cala"}};

        for (int i = 0; i < myStringArray.length; i++) {
            for (int j = 0; j < myStringArray[i].length; j++) {
                System.out.print(myStringArray[i][j] + " ");
            }
            System.out.println();
        }
       printLastLetterFromWitchElementOfArray(myStringArray);
    }

    static void printLastLetterFromWitchElementOfArray(String[][] words){
        for(int i = 0; i < words.length; i++){
            for (int j = 0; j<words[i].length; j++){
                System.out.print(words[i][j].charAt(words[i][j].length()-1) + " ");
            }

            System.out.println();

        }

    }
}

