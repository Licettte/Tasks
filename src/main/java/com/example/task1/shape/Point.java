package com.example.task1.shape;

import java.util.Objects;

public class Point {
    private Coordinate coordinate;

    public Point(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

  public Coordinate getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(coordinate, point.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate);
    }

    @Override
    public String toString() {
        return "Point{" +
                "coordinate=" + coordinate +
                '}';
    }
}