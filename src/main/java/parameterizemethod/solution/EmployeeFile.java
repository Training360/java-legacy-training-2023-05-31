package parameterizemethod.solution;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeFile {

    private Path path;

    public EmployeeFile(Path path) {
        this.path = path;
    }

    @SneakyThrows
    public List<String> readNames() {
        return Files.readAllLines(path);
    }
}
