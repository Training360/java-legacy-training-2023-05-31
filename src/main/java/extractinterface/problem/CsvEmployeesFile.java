package extractinterface.problem;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvEmployeesFile {

    private Path path;

    @SneakyThrows
    public List<String> readEmployees() {
        return Files.readAllLines(path);
    }
}
