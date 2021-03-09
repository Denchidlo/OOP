import java.util.Random;

public class CheckedTaskState implements TaskState {
    @Override
    public void getNewState(Task task) {
        Random random = new Random();
        if (random.nextInt() % 2 == 0)
            task.currentState  = new AcceptedTaskState();
        else
            task.currentState  = new RejectedTaskState();
    }

    @Override
    public void getStateInfo() {
        System.out.println("Task was checked!");
    }
}
