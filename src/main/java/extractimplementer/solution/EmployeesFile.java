package extractimplementer.solution;

import lombok.SneakyThrows;

import java.util.List;

public interface EmployeesFile {
    @SneakyThrows
    List<String> readEmployees();
}
