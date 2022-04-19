package com.example.task1.shape;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Line implements Shape {
    private Point pointA;
    private Point pointB;
}