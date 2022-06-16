package Task_1ET;

import Task_1ET.calculations.TriangleInitialization;
import Task_1ET.shape.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleInitializationTest {

    Triangle triangle = TriangleInitialization.getTriangleInitialized();

    @Test
    public void testTriangleInitialization() {
        assertEquals(0, triangle.getLineA().getPointA().getCoordinate().getX());
        assertEquals(0, triangle.getLineA().getPointA().getCoordinate().getY());

        assertEquals(0, triangle.getLineB().getPointB().getCoordinate().getY());
        assertEquals(2, triangle.getLineC().getPointA().getCoordinate().getX());

    }
}
