package introduceinstancedelegator.solution;

public class Messages {
    public static void sendMessage(String message) {
        throw new IllegalStateException("Not inicialized");
    }

    public void send(String message) {
        Messages.sendMessage(message);
    }
}
