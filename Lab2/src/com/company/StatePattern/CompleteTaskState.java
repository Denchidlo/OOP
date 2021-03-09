package com.company.StatePattern;

public class CompleteTaskState implements TaskState {
    @Override
    public void getNewState(Task task) {
        task.currentState  = new SendTaskState();
    }

    @Override
    public void getStateInfo() {
        System.out.println("com.company.StatePattern.Task was complete!");
    }
}
