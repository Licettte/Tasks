package com.example.task1.calculations;

import com.example.task1.shape.Point;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
@RequiredArgsConstructor
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

        List<Double> list = new ArrayList<>();

        list.add(lineA);
        list.add(lineB);
        list.add(lineC);
        // добавить сортировку - гипотенуза - самая длиная сторона
        Collections.sort(list);

        return (Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(list.get(2), 2));
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