package parameterizemethod.problem;

import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    // Probléma: példányosítás a metódusban
    // Megoldás: adjuk át paraméterként
    public List<String> findAll(Path path) {
        var file = new EmployeeFile(path);
        var employees = file.readNames();
        return employees.stream().map(String::toUpperCase).toList();
    }
}
