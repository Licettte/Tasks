package Task_1ET;

import Task_1ET.shape.Coordinate;
import Task_1ET.shape.Line;
import Task_1ET.shape.Point;
import Task_1ET.shape.Triangle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static Task_1ET.calculations.UtilityCalculationsTriangle.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

class UtilityCalculationsTriangleTests {
   static Triangle triangle;
    @BeforeAll
    static void init() {

        Coordinate coordinate1 = new Coordinate("0", "0");
        Coordinate coordinate2 = new Coordinate("2", "4");
        Coordinate coordinate3 = new Coordinate("4", "0");

        Point pointA = new Point(coordinate1);
        Point pointB = new Point(coordinate2);
        Point pointC = new Point(coordinate3);

        Line lineAB = new Line(pointA, pointB);
        Line lineBC = new Line(pointB, pointC);
        Line lineCA = new Line(pointC, pointA);

        triangle = new Triangle(lineAB, lineBC, lineCA);
    }
    @Test
    public void testIsInTheSamePlane() {
                assertTrue("Must not be 0 ", isInTheSamePlane(triangle.getLineA().getPointA(), triangle.getLineA().getPointB(), triangle.getLineC().getPointA()));
    }
    @Test
    public void testIsRightTriangle() {
               assertTrue("triangle is not right ", isRightTriangle(triangle));
    }
    @Test
    public void testGetPerimeter() {

        assertEquals(12.94427190999916, getPerimeter(triangle));
    }
}
