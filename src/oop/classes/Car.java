package oop.classes;

public class Car {

    private String color;
    private String brand;
    private int maxSpeed;


    public Car(String color, String brand, int maxSpeed){
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    public Car(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }



    public void printAllCarParameters(){
        System.out.printf(String.format("The car color is %s, the car brand is %s and the maxSpeed is %s \n", color, brand, maxSpeed));
    }

}
