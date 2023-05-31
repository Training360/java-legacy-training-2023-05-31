package extractandoverridecall.problem;

import jakarta.faces.context.FacesContext;
import lombok.Getter;
import lombok.Setter;

public class EmployeeController {

    @Getter
    @Setter
    private String name;

    // Probléma: Van egy kódrészlet, mely megzavarja a tesztelést
    // Megoldás: metódusba kiemelni (Refactor / Extract method), tesztben leszármazottban felülírható
    public String sayHello() {
        FacesContext.getCurrentInstance()
                .getExternalContext()
                .getFlash()
                .put("message",
                        String.format("Hello %s!", name));
        return "/hello.xhtml?faces-redirect=true";
    }

}
