package introducestaticsetter.problem;

import java.util.List;

public class EmployeeRepository {


    public static EmployeeRepository getInstance() {
        throw new IllegalStateException("Not initialized");
    }

    public List<String> findAll() {
        return List.of();
    }
}
