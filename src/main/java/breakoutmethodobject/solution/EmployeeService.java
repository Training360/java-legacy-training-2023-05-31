package breakoutmethodobject.solution;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    // Probléma: túl hosszú metódus
    // Megoldás: külön objektum, attribútumok, konstruktor paraméterek a metódus paraméterek
    public int summarize(Path file, EmployeesFile employeeFile) {
        List<String> lines = employeeFile.readLines();

        int sum = 0;
        for (var line: lines) {
            var value = Integer.parseInt(line.split(",")[1]);
            sum += value;
        }
        return sum;
    }

    public int summarize(Path file) {
        return summarize(file, new EmployeesFile(file));
    }
}
