public class RecievedTaskState implements TaskState {

    @Override
    public void getNewState(Task task) {
        task.currentState = new CompleteTaskState();
    }

    @Override
    public void getStateInfo() {
        System.out.println("Task was received!");
    }
}
