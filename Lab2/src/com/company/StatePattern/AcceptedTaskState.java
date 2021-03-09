package com.company.StatePattern;

public class AcceptedTaskState implements TaskState {
    @Override
    public void getNewState(Task task) {
        System.out.println("com.company.StatePattern.Task was already accepted");
    }

    @Override
    public void getStateInfo() {
        System.out.println("com.company.StatePattern.Task was accepted!");
    }
}
