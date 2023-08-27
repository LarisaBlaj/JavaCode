package variables;

public class DataClass {

    public static void main(String[] args) {
        byte byteNumber = 127;

        short shortNumber = (short) (byteNumber + 1);

        int intNumber = 1;

        long longNumber = Integer.MAX_VALUE + 1;

        long anotherIntNumber =(int) (longNumber + intNumber);

        System.out.println(anotherIntNumber);

        byte byteNumberTwo = (byte) (shortNumber + 10);

        System.out.println(byteNumberTwo);

        float floatNumber = 12.25f;
        double doubleNumber = 12.25D;

        float anotherFloatNumber = 50.5f + floatNumber + (float) doubleNumber;

        boolean value = true;
        boolean anotherValue = value || true;

        System.out.println(anotherValue);

        char firstCharacter ='h' ;
        char newLine ='n';

        System.out.println(newLine);
        System.out.println(firstCharacter);

        int x=0;
        int y = 4;
        double z = 3;
        x = x+2;
        z = x+y - 7;
        y = x * 3;
        System.out.println("x=" +x);
        System.out.println("y=" +y);
        System.out.println("z=" +z);




    }
}
