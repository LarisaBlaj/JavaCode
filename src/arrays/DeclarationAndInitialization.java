package arrays;

public class DeclarationAndInitialization {

    public static void main(String[] args) {

        String[] myStringArray = new String[5]; //declrarea unui array cu elem de tip string cu lungimea de 5 elemente
        myStringArray[0] = "SDA"; //initializarea valorii de pe pozitia 0 din array
        myStringArray[4] = "Curs";
        myStringArray[1] = "Larisa";

        System.out.println("Elementul de pe pozitia 0 este " + myStringArray[0]);
        System.out.println("Elementul de pe pozitia 0 este " + myStringArray[1]);
        System.out.println("Elementul de pe pozitia 0 este " + myStringArray[2]);
        System.out.println("Elementul de pe pozitia 0 este " + myStringArray[3]);
        System.out.println("Elementul de pe pozitia 0 este " + myStringArray[4]);

        System.out.println(myStringArray[1].length());

        String[] secondStringArray = new String[]{"SDA", "Larisa", "10", "Duminica"}; //declararea si initializarea unui array cu 4 elem cu tot cu initilaizarea uneu valori a fiecarui elem din array

        System.out.println(secondStringArray[2]);

        int[] intArray = new int[]{5, -1, 2, 6}; //alta var de declarare si initial a unui array si a val sale
        intArray[2] = intArray[2] + 1;

        System.out.println(intArray[2]);


        if(myStringArray[2] != null) {
            System.out.println(myStringArray[2].toLowerCase());
        }
        System.out.println(intArray[3]);

        System.out.println(intArray[intArray.length - 1]);

    }


}

