package adaptparameter.solution;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Arrays;
import java.util.List;

public record Parameters(HttpServletRequest request) {

    public List<Integer> getIds() {
        return Arrays.stream(request.getParameterValues("ids")).map(Integer::parseInt).toList();
    }
}