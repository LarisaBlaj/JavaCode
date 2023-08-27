package loops;

public class ForEx {
    public static void main(String[] args) {

        for(int i = 10; i>=0 ; i--){

            if (i == 5) {
                return;
            }
            System.out.println("Hello world " + i );

        }
        System.out.println("finish");
    }
}
