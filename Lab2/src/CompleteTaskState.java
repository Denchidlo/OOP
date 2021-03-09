public class CompleteTaskState implements TaskState{
    @Override
    public void getNewState(Task task) {
        task.currentState  = new SendTaskState();
    }

    @Override
    public void getStateInfo() {
        System.out.println("Task was complete!");
    }
}
