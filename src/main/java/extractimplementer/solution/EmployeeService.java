package extractimplementer.solution;

import java.util.List;

public class EmployeeService {

    // Probléma: direkt függőség
    // Megoldás: EmployeesFile Refactor / Extract interface - Rename original class
    public List<String> readEmployees(EmployeesFile employeesFile) {
        return employeesFile.readEmployees();
    }
}
