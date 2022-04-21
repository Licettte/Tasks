package com.example.task1.calculations;

import com.example.task1.shape.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class UtilityCalculationsTriangle {

    private UtilityCalculationsTriangle() {
        throw new java.lang.UnsupportedOperationException("Utility class and cannot be instantiated");
    }

    private static double getLengthLine(Point pointB, Point pointA) { // get triangles side
        return Math.sqrt(
                Math.pow(pointA.getCoordinate().getX() - pointB.getCoordinate().getX(), 2) + (Math
                        .pow(pointA.getCoordinate().getY() - pointB.getCoordinate().getY(), 2)));
    }

    public static double getPerimeter(Point pointA, Point pointB, Point pointC) {

        double lineA = getLengthLine(pointA, pointB);
        double lineB = getLengthLine(pointB, pointC);
        double lineC = getLengthLine(pointC, pointA);

        return lineA + lineB + lineC;

    }

    public static double findPointInTheSamePlane(Point a, Point b, Point c) {
        return a.getCoordinate().getX() * (b.getCoordinate().getY() - c.getCoordinate().getY());
    }

    public static boolean isInTheSamePlane(Point a, Point b, Point c) {
        double a1 = findPointInTheSamePlane(a, b, c);
        double b1 = findPointInTheSamePlane(b, c, a);
        double c1 = findPointInTheSamePlane(c, a, b);

        return 0 != a1 + b1 + c1;

    }

    public static boolean isRightTriangle(Point pointA, Point pointB, Point pointC) {

        double lineA = getLengthLine(pointA, pointB);
        double lineB = getLengthLine(pointB, pointC);
        double lineC = getLengthLine(pointC, pointA);

        List<Double> list = new ArrayList<>();

        list.add(lineA);
        list.add(lineB);
        list.add(lineC);
        Collections.sort(list);

        return (Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(list.get(2), 2));
    }
}