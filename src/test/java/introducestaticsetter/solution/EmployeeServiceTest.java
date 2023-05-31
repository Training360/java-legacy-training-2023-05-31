package introducestaticsetter.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeeServiceTest {

    @Test
    void findAll() {
        try (var mocked = mockStatic(EmployeeRepository.class)) {
            var repository = mock(EmployeeRepository.class);
            when(repository.findAll()).thenReturn(List.of("John", "Jack"));
            mocked.when(EmployeeRepository::getInstance).thenReturn(repository);

            var employeeService = new EmployeeService();
            System.out.println(employeeService.findAll());
        }
    }
}