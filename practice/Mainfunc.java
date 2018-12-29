package practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.lib.Greeting;
import practice.beans.*;

public class Mainfunc {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        // PrintHello.printHello();
        Greeting.printHello();
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Property p = (Property) context.getBean("helloWorld");

    }

}