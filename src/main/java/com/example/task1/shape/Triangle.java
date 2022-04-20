package com.example.task1.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private Line lineA;
    private Line lineB;
    private Line lineC;


    public Triangle(Line lineA, Line lineB, Line lineC) {
        this.lineA = lineA;
        this.lineB = lineB;
        this.lineC = lineC;
    }


    public Line getLineA() {
        return lineA;
    }

    public void setLineA(Line lineA) {
        this.lineA = lineA;
    }

    public Line getLineB() {
        return lineB;
    }

    public void setLineB(Line lineB) {
        this.lineB = lineB;
    }

    public Line getLineC() {
        return lineC;
    }

    public void setLineC(Line lineC) {
        this.lineC = lineC;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(lineA, triangle.lineA) && Objects.equals(lineB, triangle.lineB) && Objects.equals(lineC, triangle.lineC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineA, lineB, lineC);
    }
}