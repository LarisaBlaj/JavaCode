package oop.classes;

public class OuterInnerMain {
    public static void main(String[] args) {
        OuterClass objectFromOutterClass = new OuterClass();
        objectFromOutterClass.setNumber(5);

        OuterClass anotherObjectFromOuterClass = new OuterClass();
        OuterClass.InnerClass objectFromInnerClass = objectFromOutterClass.init();
        OuterClass.InnerClass anotherObjectFromInnerClass = objectFromOutterClass.new InnerClass();

        objectFromInnerClass.printNumber();
        anotherObjectFromInnerClass.printNumber();
    }
}
