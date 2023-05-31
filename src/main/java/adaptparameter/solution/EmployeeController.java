package adaptparameter.solution;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    // Probléma: HttpServletRequest nem példányosítható, és nem módosítható
    // Megoldás: IDEA / Introduce Parameter Object
    public void listEmployeesByIds(Parameters parameters) {
        var ids = parameters.getIds();
        employeeService.findAll(ids);
    }
}
