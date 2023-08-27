package oop.staticclasses;

public class Main {

    public static void main(String[] args) {
        ExternalClass objectFromExternalClass = new ExternalClass();

        ExternalClass.InternalClass objectFromInternalClass = objectFromExternalClass.init();
        ExternalClass.InternalClass otherObjectFronInternalClass = new ExternalClass.InternalClass();
        objectFromInternalClass.print("Some text");
        otherObjectFronInternalClass.print("Another text");
    }
}
