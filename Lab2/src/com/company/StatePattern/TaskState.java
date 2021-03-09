package com.company.StatePattern;

public interface TaskState {
    void getNewState(Task task);

    void getStateInfo();
}