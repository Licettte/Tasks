package Task_1ET;

import Task_1ET.calculations.TriangleInitialization;
import Task_1ET.shape.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task1Application {
    public static void main(String[] args) {
        SpringApplication.run(Task1Application.class, args);

        Triangle triangle = TriangleInitialization.getTriangleInitialized();

     }
}
