package Task_1ET.calculations;

import Task_1ET.shape.Coordinate;
import Task_1ET.shape.Line;
import Task_1ET.shape.Point;
import Task_1ET.shape.Triangle;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


@Slf4j
public class TriangleInitialization {

    private static final String coordinate01 = "src/main/resources/Coordinate.txt";

    private TriangleInitialization() {
        throw new java.lang.UnsupportedOperationException("Utility class and cannot be instantiated");
    }

    public static List<String> reader(File file) throws IOException {
        return Files.readAllLines(Paths.get(String.valueOf(file)));
    }

    @SneakyThrows
    public static Triangle getTriangleInitialized() {

        List<String> reader = reader(new File(coordinate01));
        log.info(reader + "reader");
        log.error("reader", new Throwable("file is empty"));

        Coordinate coordinate1 = new Coordinate(reader.get(0), reader.get(1));
        log.info(coordinate1 + "coordinate1");
        log.error("coordinate1", new Throwable("coordinate1 is empty"));

        Coordinate coordinate2 = new Coordinate(reader.get(2), reader.get(3));
        log.info(coordinate2 + "coordinate2");

        Coordinate coordinate3 = new Coordinate(reader.get(4), reader.get(5));
        log.info(coordinate3 + "coordinate3");

        Point pointA = new Point(coordinate1);
        Point pointB = new Point(coordinate2);
        Point pointC = new Point(coordinate3);

        Line lineAB = new Line(pointA, pointB);
        Line lineBC = new Line(pointB, pointC);
        Line lineCA = new Line(pointC, pointA);

        return new Triangle(lineAB, lineBC, lineCA);
    }
}
