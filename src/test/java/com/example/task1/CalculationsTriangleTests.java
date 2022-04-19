package com.example.task1;

import com.example.task1.calculations.CalculationsTriangle;
import com.example.task1.shape.Coordinate;
import com.example.task1.shape.Point;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
public class CalculationsTriangleTests {
    //    @Autowired
//    Point point;
//    @Autowired
//    Coordinate coordinate;
//    @Autowired
//    Line line;

    Coordinate coordinate1 = new Coordinate(1, 1);

    Coordinate coordinate2 = new Coordinate(1, 4);

    Coordinate coordinate3 = new Coordinate(6, 4);


    Point pointA = new Point(coordinate1);// каждая точка принимает две координаты.

    Point pointB = new Point(coordinate2);

    Point pointC = new Point(coordinate3);


    @Test
    public void testIsInTheSamePlane() {

        CalculationsTriangle calculationsTriangle = new CalculationsTriangle();

        assertTrue("Должно быть не равно 0", !calculationsTriangle.isInTheSamePlane(pointA, pointB, pointC));
    }

//    @Test
//    public void testCorrectFemaleKind() throws Exception {
//        assertEquals(FEMALE, bankAccountClass.bankAccount(FEMALE).getKind());
//    }

}