package com.example.task1.shape;

import lombok.*;

@Data
@AllArgsConstructor
public class Triangle implements Shape {
    private Line lineA;
    private Line lineB;
    private Line lineC;
}