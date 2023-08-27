package datetime;

import java.time.LocalDate;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate futureDate = LocalDate.of(2023,10,20);
        LocalDate pastDate = LocalDate.of(2023,6,20);

        System.out.println(futureDate);
        System.out.println(pastDate);

        String formateDate = currentDate.getDayOfMonth() + "/" + currentDate.getMonth() + "/" + currentDate.getYear();
        System.out.println(formateDate);


    }

}
