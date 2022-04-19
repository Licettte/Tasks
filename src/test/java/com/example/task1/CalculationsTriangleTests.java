package com.example.task1;

import com.example.task1.calculations.CalculationsTriangle;
import com.example.task1.shape.Coordinate;
import com.example.task1.shape.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
public class CalculationsTriangleTests {
    Coordinate coordinate1 = new Coordinate(0, 0);
    Coordinate coordinate2 = new Coordinate(0, 4);
    Coordinate coordinate3 = new Coordinate(6, 4);

    Point pointA = new Point(coordinate1);
    Point pointB = new Point(coordinate2);
    Point pointC = new Point(coordinate3);

    CalculationsTriangle calculationsTriangle = new CalculationsTriangle();


//    @Test
//    @BeforeEach
//    public void init() {
//    CalculationsTriangle    calculationsTriangle = new CalculationsTriangle();
//
//        Coordinate coordinate1 = new Coordinate(1, 1);
//        Coordinate coordinate2 = new Coordinate(1, 4);
//        Coordinate coordinate3 = new Coordinate(6, 4);
//
//         pointA = new Point(coordinate1);
//         pointB = new Point(coordinate2);
//         pointC = new Point(coordinate3);
//
//    }

    @Test
    public void testIsInTheSamePlane() {

        assertTrue("Должно быть не равно 0", calculationsTriangle.isInTheSamePlane(pointA, pointB, pointC));
    }

    @Test
    public void testIsRightTriangle() {

        CalculationsTriangle calculationsTriangle = new CalculationsTriangle();
        assertTrue("треугольник не прямоугольный", calculationsTriangle.isRightTriangle(pointA, pointB, pointC));
    }
}