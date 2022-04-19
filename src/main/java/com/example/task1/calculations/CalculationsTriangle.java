package com.example.task1.calculations;

import com.example.task1.shape.Point;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CalculationsTriangle {

    private double getLengthLine(Point pointB, Point pointA) { // get triangles side
        return Math.sqrt(
                Math.pow(pointA.getCoordinate().getX() - pointB.getCoordinate().getX(), 2) + (Math
                        .pow(pointA.getCoordinate().getY() - pointB.getCoordinate().getY(), 2)));
    }

    public double getPerimeter(Point pointA, Point pointB, Point pointC) {

        double lineA = getLengthLine(pointA, pointB);
        double lineB = getLengthLine(pointB, pointC);
        double lineC = getLengthLine(pointC, pointA);

        return lineA + lineB + lineC;

    }

    public boolean isInTheSamePlane(Point a, Point b, Point c) {
        return 0 != a.getCoordinate().getX() * (b.getCoordinate().getY() - c.getCoordinate().getY()) +
                b.getCoordinate().getX() * (c.getCoordinate().getY() - a.getCoordinate().getY()) +
                c.getCoordinate().getX() * (a.getCoordinate().getY() - b.getCoordinate().getY());
    }

    public boolean isRightTriangle(Point pointA, Point pointB, Point pointC) {

        // добавить сортировку - гипотенуза - самая длиная сторона
        double lineA = getLengthLine(pointA, pointB);
        double lineB = getLengthLine(pointB, pointC);
        double lineC = getLengthLine(pointC, pointA);



        return (Math.pow(lineA, 2) + Math.pow(lineB, 2) == Math.pow(lineC, 2));
    }


//    public static void main(String[] args) {
//
//        Point pointA = new Point(new Coordinate(0, 0));// каждая точка принимает две координаты.
//        Point pointB = new Point(new Coordinate(0, 4));
//        Point pointC = new Point(new Coordinate(6, 4));
//
//        CalculationsTriangle calculationsTriangle = new CalculationsTriangle();
//        calculationsTriangle.getPerimeter(pointA, pointB, pointC);
//
//        System.out.println(calculationsTriangle.isRightTriangle(pointA, pointB, pointC));
//        System.out.println(calculationsTriangle.isInTheSamePlane(pointA, pointB, pointC));
//    }
}