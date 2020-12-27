package leetcode.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/task-scheduler/ (https://leetcode.com/problems/task-scheduler/)
 */
public class TaskScheduler {

    /*
    The idea is to maintain a waiting list and an active heap from which tasks will be executed. For every cycle:
        1. remove elements from waitlist that have cooled down and add then to heap
        2. remove elements from heap that need to cool down and add them to waitlist
        3. execute task from heap and decrement the count of the task and update last used. add it back to heap if task.count > 0
     */
    public static int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for (char c : tasks) {
            count[c - 'A']++;
        }

        PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> a.count == b.count ? a.lastExecuted - b.lastExecuted : b.count - a.count);
        Queue<Task> waitQueue = new LinkedList<>();

        for(int i=0; i<26; i++) {
            if (count[i] != 0) {
                pq.add(new Task((char)(i + 'A'), count[i]));
            }
        }

        int cycles = 0;

        while(!pq.isEmpty() || !waitQueue.isEmpty()) {

            // add waiting tasks to heap if they can be run
            while(!waitQueue.isEmpty() && waitQueue.peek().lastExecuted + n < cycles)
                pq.add(waitQueue.poll());

            // while there are tasks in the heap that needs to cool down
            while(!pq.isEmpty() && pq.peek().lastExecuted + n >= cycles) {
                waitQueue.add(pq.poll());
            }

            // execute task from heap
            if (!pq.isEmpty() && pq.peek().lastExecuted + n < cycles) {
                Task task = pq.poll();
                task.count--;
                task.lastExecuted = cycles;

                if (task.count > 0)
                    pq.add(task);

            }
            cycles++;
        }
        return cycles;
    }
}

class Task {
    char task;
    int count;
    int lastExecuted;

    Task(char _task, int _count) {
        task = _task;
        count = _count;
        lastExecuted = -101;
    }
}

