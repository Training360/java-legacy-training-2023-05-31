package adaptparameter.problem;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    // Probléma: HttpServletRequest nem példányosítható, és nem módosítható
    // Megoldás: IDEA / Introduce Parameter Object
    public void listEmployeesByIds(HttpServletRequest request) {
        var ids = Arrays.stream(request.getParameterValues("ids")).map(Integer::parseInt).toList();
        employeeService.findAll(ids);
    }
}
