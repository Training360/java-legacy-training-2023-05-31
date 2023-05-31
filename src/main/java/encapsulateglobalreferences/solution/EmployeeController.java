
package encapsulateglobalreferences.solution;

import jakarta.faces.context.FacesContext;
import lombok.Getter;
import lombok.Setter;

public class EmployeeController {

    @Getter
    @Setter
    private String name;

    // Probléma: FacesContext globális hivatkozás
    // Megoldás: osztályba kiemelni, injection
    public String sayHello(Messages messages) {
        messages.createMessage(name);
        return "/hello.xhtml?faces-redirect=true";
    }

}
