package introducestaticsetter.problem;

import java.util.List;

public class EmployeeService {

    // Probléma: teszt esetén nem a visszaadott példányra van szükségem
    // Megoldás: setter bevezetése
    // Másik megoldás: getInstance() mockolható
    public List<String> findAll() {
        var employees = EmployeeRepository.getInstance().findAll();
        return employees.stream().map(String::toUpperCase).toList();
    }
}
