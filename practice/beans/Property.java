package practice.beans;

public class Property {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public static void printHello() {
        System.out.println("Hello, World");
    }

}