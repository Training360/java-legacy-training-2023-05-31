package replaceglobalreferencewithgetter.problem;

import java.util.List;

public class EmployeeService {

    // Probléma: teszt esetén nem a visszaadott példányra van szükségem
    // Megoldás: kiszervezni protected getterbe, és felülírni
    public List<String> findAll() {
        var employees = EmployeeRepository.getInstance().findAll();
        return employees.stream().map(String::toUpperCase).toList();
    }
}
