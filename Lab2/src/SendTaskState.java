public class SendTaskState implements TaskState {
    @Override
    public void getNewState(Task task) {
        task.currentState = new CheckedTaskState();
    }

    @Override
    public void getStateInfo() {
        System.out.println("Task was send!");
    }
}
