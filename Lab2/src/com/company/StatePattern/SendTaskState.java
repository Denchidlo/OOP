package com.company.StatePattern;

public class SendTaskState implements TaskState {
    @Override
    public void getNewState(Task task) {
        task.currentState = new CheckedTaskState();
    }

    @Override
    public void getStateInfo() {
        System.out.println("com.company.StatePattern.Task was send!");
    }
}
