package variables;

public class VariableExemp {

    static int globalVariable = 10;

    public static void main(String[] args) {
        int passenger; //declarare varioabila
        passenger = 0; //initiliazarea variabilei
        passenger = passenger + 5; //actualizarea variabilei
        passenger = passenger - 2 + 3;
        passenger = passenger + 2;
        System.out.println(passenger);

        int stops;
        int fare;
        stops = 0;
        fare = 0;
        stops = stops + 1;
        fare = fare + 5;
        stops = stops + 1;
        fare = fare + 3;
        stops = stops + 1;
        fare = fare + 7;
        System.out.println(stops);
        System.out.println(fare);
        System.out.println(globalVariable);

        final int MINUTES_IN_AN_HOUR = 60;

        int minutesInADay = 24 * MINUTES_IN_AN_HOUR;
        System.out.println(minutesInADay);
        System.out.println(MINUTES_IN_AN_HOUR * 24);


    }
}
