package Task_1ET.calculations;

import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Data
public final class UtilityReader{

    private UtilityReader() {
        throw new java.lang.UnsupportedOperationException("Utility class and cannot be instantiated");
    }

    public static List<String> reader(File file) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(String.valueOf(file)));
        return lines;
    }

}