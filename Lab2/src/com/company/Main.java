package com.company;
import com.company.StatePattern.Task;

public class Main {

    public static void main(String[] args) {

        Task task = new Task();
        for (int i = 0; i < 10; i++) {
            task.showCurrentState();
            task.getNewState();
        }
    }
}
