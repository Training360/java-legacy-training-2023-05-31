package parameterizemethod.solution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    EmployeeFile employeeFile;

    @Test
    void findAll() {
        var service = new EmployeeService();
        when(employeeFile.readNames()).thenReturn(List.of("Jack", "Jane"));
        var result = service.findAll(Path.of("employees.txt"), employeeFile);
        assertEquals(result, List.of("JACK", "JANE"));
    }
}