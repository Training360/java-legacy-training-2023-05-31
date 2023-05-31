package parameterizeconstructor.solution;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository repository;

    public List<String> findAll() {
        var employees = repository.findAll();
        return employees.stream().map(String::toUpperCase).toList();
    }
}
