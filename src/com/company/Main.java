package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Triangle.Point(0, 0),
                new Triangle.Point(10, 0),
                new Triangle.Point(5, 5)
        );
        System.out.println(triangle.square());
    }
}
