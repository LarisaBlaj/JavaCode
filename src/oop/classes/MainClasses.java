package oop.classes;

import oop.books.Book;

public class MainClasses {

    public static void main(String[] args) {
        Movie oppenheimer = new Movie();
        oppenheimer.setTitle("Oppenheimer");
        oppenheimer.setDurationInMinute(180);

        oppenheimer.play();
        oppenheimer.stop();

        System.out.println(oppenheimer.getDurationInMinute());
        System.out.println(oppenheimer.getTitle().toUpperCase());

        System.out.println("---------------------------------------------------");
        Car car1 = new Car("alb", "Dacia", 150);
        car1.printAllCarParameters();
        car1.setColor("red");
        car1.printAllCarParameters();
        System.out.println("Marca masinii este " + car1.getBrand());

        Car car2 = new Car("BMW", 200);
        car2.setColor("albastru");

        Car car3 = new Car("verde", "Audi", 250);

        car2.printAllCarParameters();
        car3.printAllCarParameters();


        System.out.println("-----------------------------------------------------------");

        Book book1 = new Book();

        book1.author = "Eminescu";
        book1.setNumberOfPages(257);


        System.out.println("Autorul cartii este " + book1.author + " si numarul de pagini este "+ book1.getNumberOfPages());

        oop.anotherbooks.Book bookFromAnother = new oop.anotherbooks.Book();

    }
}
