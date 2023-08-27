package exercises;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {

    private String name;
    private String email;
    private int salary;
    private LocalDate hireDate;


    public Employee(String name, String email, int salary, LocalDate hireDate){
        this.name = name;

        this.salary = salary;
        this.hireDate = hireDate;
        if(isEmailValid(email)){
            this.email = email;
        } else{
            System.out.println("Email invalid");
        }

    }
    public LocalDate getHireDate(){
        return getHireDate();
    }

    private boolean isEmailValid(String email){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
