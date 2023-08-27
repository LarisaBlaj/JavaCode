package exercises;


import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Employee larisa = new Employee("Larisa", "larisa@gmail.com", 2000, LocalDate.of(2014, Month.FEBRUARY, 14));


        Employee maria = new Employee("Maria Popescu", "mariapopescu23@gmail.com", 3000, LocalDate.of(2014, Month.AUGUST, 22));


        Employee radu = new Employee("Radu Ion", "radui@gmail.com", 2500, LocalDate.of(2016, Month.MARCH, 14));

        Company consultingSrl = new Company(new Employee[]{larisa, maria, radu});

        consultingSrl.printAllEmployees();
    }
}
