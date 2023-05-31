package encapsulateglobalreferences.solution;

import jakarta.faces.context.FacesContext;

public class Messages {

    public void createMessage(String value) {
        FacesContext.getCurrentInstance()
                .getExternalContext()
                .getFlash()
                .put("message",
                        String.format("Hello %s!", value));
    }
}
