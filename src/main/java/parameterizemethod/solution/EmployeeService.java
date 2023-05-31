package parameterizemethod.solution;

import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    // Probléma: példányosítás a metódusban
    // Megoldás: adjuk át paraméterként
    public List<String> findAll(Path path, EmployeeFile employeeFile) {
        var file = employeeFile;
        System.out.println(path);
        var employees = file.readNames();
        return employees.stream().map(String::toUpperCase).toList();
    }

    public List<String> findAll(Path path) {
        return findAll(path, new EmployeeFile(path));
    }
}
