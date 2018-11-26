package com.company;

public class Triangle {
    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private Point pointA;
    private Point pointB;
    private Point pointC;

    private double dd;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

        dd = formula(pointA, pointB, pointC);
    }

    public double formula (Point p1, Point p2, Point p3) {
        return  (p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y);
    }

    public double square() {
        double s = dd/2;
        return s;
    }
}
