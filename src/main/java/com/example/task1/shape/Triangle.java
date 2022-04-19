package com.example.task1.shape;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Triangle implements Shape {
    private Line lineA;
    private Line lineB;
    private Line lineC;
}