package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int number1 =7;
        int number2 =5;

        System.out.println(number1 ==number2);
        System.out.println(number1 !=number2);

        boolean firstValue = true;
        boolean secondValue = false;

        System.out.println(firstValue == secondValue);
        System.out.println(firstValue != secondValue);

        System.out.println(number1 > number2);

        boolean resultValue =(6 > number1) && (6< number2);
        System.out.println(resultValue);


    }

}
