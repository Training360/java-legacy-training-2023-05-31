package introduceinstancedelegator.problem;

import lombok.Getter;
import lombok.Setter;

public class EmployeeController {

    @Getter
    @Setter
    private String name;

    // Probléma: Messages sendMessage metódusa megnehezíti a tesztelést
    // Megoldás: példánymetódusba csomagolni, override-olható lesz
    public String sayHello() {
        Messages
                .sendMessage("message");
        return "/hello.xhtml?faces-redirect=true";
    }

}
