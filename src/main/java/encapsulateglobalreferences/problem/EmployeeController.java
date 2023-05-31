package encapsulateglobalreferences.problem;

import jakarta.faces.context.FacesContext;
import lombok.Getter;
import lombok.Setter;

public class EmployeeController {

    @Getter
    @Setter
    private String name;

    // Probléma: FacesContext globális hivatkozás
    // Megoldás: osztályba kiemelni, injection
    public String sayHello() {
        FacesContext.getCurrentInstance()
                .getExternalContext()
                .getFlash()
                .put("message",
                        String.format("Hello %s!", name));
        return "/hello.xhtml?faces-redirect=true";
    }

}
