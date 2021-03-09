public class AcceptedTaskState implements TaskState {
    @Override
    public void getNewState(Task task) {
        System.out.println("Task was already accepted");
    }

    @Override
    public void getStateInfo() {
        System.out.println("Task was accepted!");
    }
}
