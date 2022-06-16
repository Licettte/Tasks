package Task_1ET.calculations;

import Task_1ET.shape.Coordinate;
import Task_1ET.shape.Line;
import Task_1ET.shape.Point;
import Task_1ET.shape.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class UtilityCalculationsTriangle {

    private UtilityCalculationsTriangle() {
        throw new java.lang.UnsupportedOperationException("Utility class and cannot be instantiated");
    }

    private static double getLengthLine(Line line) {
        Coordinate coordinateA = line.getPointA().getCoordinate();
        Coordinate coordinateB = line.getPointB().getCoordinate();

        return Math.sqrt(
                Math.pow(coordinateA.getX() - coordinateB.getX(), 2) + (Math
                        .pow(coordinateA.getY() - coordinateB.getY(), 2)));
    }

    public static double getPerimeter(Triangle triangle) {
        return getLengthLine(triangle.getLineA()) + getLengthLine(triangle.getLineB()) + getLengthLine(triangle.getLineC());
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

    public static boolean isRightTriangle(Triangle triangle) {

        double lineA = getLengthLine(triangle.getLineA());
        double lineB = getLengthLine(triangle.getLineB());
        double lineC = getLengthLine(triangle.getLineC());

        List<Double> list = new ArrayList<>();

        list.add(lineA);
        list.add(lineB);
        list.add(lineC);
        Collections.sort(list);
        return (Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2) == Math.pow(list.get(2), 2));
    }
}
