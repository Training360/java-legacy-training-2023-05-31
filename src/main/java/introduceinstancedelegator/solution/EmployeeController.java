package introduceinstancedelegator.solution;

import lombok.Getter;
import lombok.Setter;

public class EmployeeController {

    @Getter
    @Setter
    private String name;

    // Probléma: Messages sendMessage metódusa megnehezíti a tesztelést
    // Megoldás: példánymetódusba csomagolni, override-olható lesz
    public String sayHello(Messages messages) {
        messages.send("message");
        return "/hello.xhtml?faces-redirect=true";
    }

}
