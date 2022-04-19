package com.example.task1.shape;

import lombok.*;

@Data
@AllArgsConstructor
public class Line implements Shape {
    private Point pointA;
    private Point pointB;
}