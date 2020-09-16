package com.company;

import kg.geek.duringTheLesson.*;
import kg.geek.homeWorkj2.less3.*;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Figure circle = new Circle("circle", 12.3);
        Figure triangle = new Triangle("triange", 1, 2, 2);
        Figure square = new Square("square", 2, 2, 2, 2);
        Figure circle2 = new Circle("circle2", 15.3);
        Figure circle3 = new Circle("circle3", 11.3);
        Figure circle4 = new Circle("circle4", 18.3);
        Rectangle rectangle = new Rectangle("Rectangle", 20.34, 20.30);

        Figure[] figures = new Figure[]{circle, circle2, circle3, circle4, triangle, square, rectangle, new Triangle("Triangle", 2, 3, 3)};

        for (int i = 0; i < figures.length; i++) {
            System.out.print(figures[i].getName() + " ");
            figures[i].calculatePerimeter();
            System.out.print(figures[i].draw());

        }

        Dog dog = new Dog("Algyr");
        System.out.println(dog.getName() + " " + dog.draw());
        dog.callSound(CommandType.ROLL_OVER);
        dog.callSound(CommandType.SIT_DOWN);
        dog.callSound(CommandType.BARK_UP);

        /*home work down below */
        System.out.println("\nHome work down below <--------");
        Printable mac = createObject("MacOS");

//        Below created the Wind object
        Printable wind = createObject("WindowsOS");

//        Below created the Linux object
        Printable linux = createObject("LinuxOS");

        Printable[] printables = {wind, linux, mac};
        for (Printable pr : printables) {
            pr.printAll();
        }


    }

    public static Printable createObject(String className) {

        Printable printable = null;
        switch (className) {
            case "WindowsOS":
                printable = new WindowsOS("single-tasking", "Windows", 10.232, new Processor(2.3, "core i5", "graphics nvd"), SecureHardware.WINDOWS_DEFENDER_FIREWALL, "OneDrive", "Cortana");
                break;
            case "MacOS":
                printable = new MacOS("multi-tasking", "MacOS", 10.15, new Processor(1.8, "core i5", "Graphics 6000 1536 MB"), SecureHardware.APPLE_T2_SECURITY, "apple store new generation", "pears with last generation", "brand \uF8FF");
                break;
            case "LinuxOS":
                printable = new LinuxOS("single-task", "linuxOS", 15.3, new Processor(1.6, "core i7", "graphics 200"), SecureHardware.LINUX_SERVER_SECURITY, "UBUNTU", "CINNAMON");
                break;
        }

        return printable;
    }


}







