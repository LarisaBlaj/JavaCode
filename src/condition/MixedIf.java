package condition;

public class MixedIf {
    public static void main(String[] args) {

        float temperature = -5;

        if (temperature <= 0) {

            System.out.println("Este iarna, imbrca-te foarte gros");
        } else if (0 < temperature && temperature < 20) {
            System.out.println("Este frig dar ai nevoie de o jacheta");

        } else {
            System.out.println("Este cald, poti sa iesi in tricou");

        }

    }
}

