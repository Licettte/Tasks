package com.example.task1;

import com.example.task1.shape.Coordinate;
import com.example.task1.shape.Point;
import org.junit.jupiter.api.Test;

import static com.example.task1.calculations.UtilityCalculationsTriangle.isInTheSamePlane;
import static com.example.task1.calculations.UtilityCalculationsTriangle.isRightTriangle;
import static org.springframework.test.util.AssertionErrors.assertTrue;


public class CalculationsTriangleTests {

    Coordinate coordinate1 = new Coordinate(0, 0);
    Coordinate coordinate2 = new Coordinate(0, 4);
    Coordinate coordinate3 = new Coordinate(6, 4);

    Point pointA = new Point(coordinate1);
    Point pointB = new Point(coordinate2);
    Point pointC = new Point(coordinate3);

    @Test
    public void testIsInTheSamePlane() {
        assertTrue("Must not be 0 ", isInTheSamePlane(pointA, pointB, pointC));
    }

    @Test
    public void testIsRightTriangle() {

        assertTrue("triangle is not right ", isRightTriangle(pointA, pointB, pointC));
    }
}