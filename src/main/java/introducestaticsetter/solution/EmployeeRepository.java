package introducestaticsetter.solution;

import java.util.List;

public class EmployeeRepository {

    private static EmployeeRepository employeeRepository = new EmployeeRepository();

    public static EmployeeRepository getInstance() {
        return employeeRepository;
    }

    // Ne használd, csak teszteléshez!
    public static void setRepository(EmployeeRepository newEmployeeRepository) {
        employeeRepository = newEmployeeRepository;
    }

    public List<String> findAll() {
        throw new IllegalStateException("Not initialized");
    }
}
