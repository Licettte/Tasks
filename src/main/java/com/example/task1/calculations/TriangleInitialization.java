package com.example.task1.calculations;

import com.example.task1.shape.Coordinate;
import com.example.task1.shape.Line;
import com.example.task1.shape.Point;
import com.example.task1.shape.Triangle;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.List;


@Slf4j
public class TriangleInitialization {

    static final String coordinate01 = "D:\\Coordinates\\Coord1.txt";


    @SneakyThrows
    private static Triangle getTriangleInitialized() {

        List<String> reader = UtilityReader.reader(new File(coordinate01));
        log.info(reader + "reader");
        log.error("reader", new Throwable("file is empty"));
        // I wrote   @SneakyThrows, but I'm not sure. Here should add exception for the file, if it will be is empty
        // + if there aren't integer values
        // + here we need to add  the constraint that we can't to add >reader.size(),
        // + add constraints for null initialization, but I don't know how
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
