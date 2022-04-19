package com.example.task1;

import com.example.task1.calculations.CalculationsTriangle;
import com.example.task1.shape.Coordinate;

import com.example.task1.shape.Point;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
public class CalculationsTriangleTests {

    @MockBean
    Point pointA = new Point(new Coordinate(0, 0));// каждая точка принимает две координаты.
    @MockBean
    Point pointB = new Point(new Coordinate(0, 4));
    @MockBean
    Point pointC = new Point(new Coordinate(6, 4));
    @MockBean
    CalculationsTriangle calculationsTriangle = new CalculationsTriangle();

    @Test
    public void testIsInTheSamePlane(Point pointA, Point pointB, Point pointC) {

        assertTrue("Должно быть не равно 0", !calculationsTriangle.isInTheSamePlane(pointA, pointB, pointC));
    }
}