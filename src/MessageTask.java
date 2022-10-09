public class MessageTask extends Task {

    private Message message;

    public MessageTask(String taskId, String descriere, Message message) {
        super(taskId, descriere);
        this.message = message;
    }

    @Override
    public void execute() {

    }
}
