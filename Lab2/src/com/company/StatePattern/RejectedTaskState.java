package com.company.StatePattern;

public class RejectedTaskState implements TaskState {
    @Override
    public void getNewState(Task task) {
        task.currentState  = new RecievedTaskState();
    }

    @Override
    public void getStateInfo() {
        System.out.println("com.company.StatePattern.Task was rejected!");
    }
}
