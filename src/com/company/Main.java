package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape triangle = new Triangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());

        Shape square = new Square(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(square);
        System.out.println(square.getPerimeter());

        Shape ellipse = new Ellipse(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(ellipse);
        System.out.println(ellipse.getPerimeter());

        Shape circle = new Circle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(circle);
        System.out.println(circle.getPerimeter());


        Shape rectangle = new Rectangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
    }
}
