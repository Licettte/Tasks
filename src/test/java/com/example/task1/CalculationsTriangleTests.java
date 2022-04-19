package com.example.task1;

import com.example.task1.calculations.CalculationsTriangle;
import com.example.task1.shape.Coordinate;
import com.example.task1.shape.Line;
import com.example.task1.shape.Point;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
public class CalculationsTriangleTests {
    @Autowired
    Point point;
    Coordinate coordinate;
    Line line;

    @MockBean
    Coordinate coordinate1 = new Coordinate(1, 1);
    @MockBean
    Coordinate coordinate2 = new Coordinate(1, 4);
    @MockBean
    Coordinate coordinate3 = new Coordinate(6, 4);

    @MockBean
    Point pointA = new Point(coordinate1);// каждая точка принимает две координаты.
    @MockBean
    Point pointB = new Point(coordinate2);
    @MockBean
    Point pointC = new Point(coordinate3);


    CalculationsTriangle calculationsTriangle = new CalculationsTriangle();

    @Test
    public void testIsInTheSamePlane() {
        assertTrue("Должно быть не равно 0", !calculationsTriangle.isInTheSamePlane(pointA, pointB, pointC));
    }

//    @Test
//    public void testCorrectFemaleKind() throws Exception {
//        assertEquals(FEMALE, bankAccountClass.bankAccount(FEMALE).getKind());
//    }

}