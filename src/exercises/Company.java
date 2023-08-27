package exercises;

public class Company {
   private Employee[] employees;

   public Company(Employee[] employees){
       this.employees =employees;

   }

   public void printAllEmployees(){
       System.out.println("Lista cu angajatii este: ");
       for (int i = 0; i <employees.length; i++)
           System.out.println(employees[i]);
   }




}
