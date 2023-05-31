package subclassandoverridemethod.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeeServiceTest {

    @Test
    void findUpperCasedEmployees() {
//        var employeeService = new EmployeeService() {
//            @Override
//            protected List<String> findEmployees() {
//                return List.of("Jack", "Jane");
//            }
//        };
        var employeeService = spy(new EmployeeService());
//        when(employeeService.findEmployees()).thenReturn(List.of("Jane", "Jack"));
        doReturn(List.of("Jane", "Jack")).when(employeeService).findEmployees();
        var names = employeeService.findUpperCasedEmployees();
        assertEquals(names, List.of("JANE", "JACK"));
    }
}