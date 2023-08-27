package arrays;

public class ForEachEx {
    public static void main(String[] args) {
        int[] numbers = {5, -1, 10, 3};

        for (int number : numbers) {
            System.out.println(number);

        }
        System.out.println("___________________________________________________");

        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
