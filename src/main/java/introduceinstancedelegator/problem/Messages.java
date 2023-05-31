package introduceinstancedelegator.problem;

public class Messages {
    public static void sendMessage(String message) {
        throw new IllegalStateException("Not inicialized");
    }
}
