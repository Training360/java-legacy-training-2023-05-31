package parameterizeconstructor.problem;

import java.util.List;

public class EmployeeService {

    private EmployeeRepository repository;

    // Probléma: példányosítás a konstruktorban
    // Megoldás: dependency injection
    public EmployeeService() {
        repository = new EmployeeRepository();
    }

    public List<String> findAll() {
        var employees = repository.findAll();
        return employees.stream().map(String::toUpperCase).toList();
    }
}
