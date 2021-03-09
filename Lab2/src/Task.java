public class Task {
    TaskState currentState;

    public Task() {
        this.currentState = new RecievedTaskState();
    }

    public void showCurrentState() {
        currentState.getStateInfo();
    }

    public void getNewState() {
        currentState.getNewState(this);
    }
}
