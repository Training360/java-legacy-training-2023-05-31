package breakoutmethodobject.solution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Value
@AllArgsConstructor
public class EmployeesFile {

    Path file;

    public List<String> readLines() {
        List<String> lines;
        try {
            lines = Files.readAllLines(file);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return lines;
    }
}
