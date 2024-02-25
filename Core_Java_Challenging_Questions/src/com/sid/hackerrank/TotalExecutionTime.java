/**
 * To calculate the total execution time when multiple tasks are completed,
 * you need to keep track of the start and end times of each task and then sum up the durations of all tasks.
 */
package com.sid.hackerrank;

import java.util.List;
import java.util.ArrayList;

class Task {
    int startTime;
    int endTime;

    public Task(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}

public class TotalExecutionTime {

    public static void main(String[] args) {
        // Sample tasks
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, 5));
        tasks.add(new Task(2, 7));
        tasks.add(new Task(4, 9));

        // Calculate total execution time
        int totalExecutionTime = getTotalExecutionTime(tasks);
        System.out.println("Total execution time: " + totalExecutionTime);
    }

    public static int getTotalExecutionTime(List<Task> tasks) {
        int totalExecutionTime = 0;
        int maxEndTime = 0;

        // Find the maximum end time among all tasks
        for (Task task : tasks) {
            maxEndTime = Math.max(maxEndTime, task.endTime);
        }

        // Create an array to track the time spent on each unit of time
        int[] timeSpent = new int[maxEndTime + 1];

        // Increment the time spent for each task
        for (Task task : tasks) {
            for (int i = task.startTime; i < task.endTime; i++) {
                timeSpent[i]++;
            }
        }

        // Sum up the time spent on each unit of time
        for (int time : timeSpent) {
            totalExecutionTime += time;
        }

        return totalExecutionTime;
    }

}