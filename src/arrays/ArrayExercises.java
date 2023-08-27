package arrays;

public class ArrayExercises {


    public static void main(String[] args) {
        ArrayExercises object = new ArrayExercises();
        String[] arrayOfString = {"Maria", "Bonc", "Card", "Teleenciclopedie", "scurt", "ac"};
        System.out.println(object.findTheLongestText(arrayOfString));


    }
    String findTheLongestText(String[] arrayOfText){ //metoda si in paranteza numele stringului
        String longestText = arrayOfText[0];
        for(String myText: arrayOfText ){
            if(longestText.length() < myText.length()){
                longestText=myText;
            }
        }
        return longestText;

    }


}
