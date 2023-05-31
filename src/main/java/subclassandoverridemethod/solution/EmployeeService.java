package subclassandoverridemethod.solution;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    // Probléma: a hívott metódus megnehezíti a tesztelést
    // Megoldás: leszármaztatás, és a metódus felülírása, Mockito spy
    public List<String> findUpperCasedEmployees() {
        return findEmployees().stream().map(String::toUpperCase).toList();
    }

    @SneakyThrows
    // Azért friend, hogy tudjuk tesztelni
    List<String> findEmployees() {
        return Files.readAllLines(Path.of("employees.txt"));
    }


}
