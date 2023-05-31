package extractinterface.problem;

import java.util.List;

public class EmployeeService {

    // Probléma: direkt függőség
    // Megoldás: EmployeesFile Refactor / Extract interface
    public List<String> readEmployees(CsvEmployeesFile csvEmployeesFile) {
        return csvEmployeesFile.readEmployees();
    }
}
