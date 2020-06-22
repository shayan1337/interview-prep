package leetcode.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Premium
 * 253. Meeting Rooms II (https://leetcode.com/problems/meeting-rooms-ii/)
 */
public class MeetingRoomsII {

    public static int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0)
            return 0;

        /**
         * Sort the meeting by start time. For every allocation of room, check if any of the previous meetings have ended.
         * If they have, swap them out. If no rooms are available assign a new one.
         */
        List<Meeting> meetings = new ArrayList<>(intervals.length);
        for(int[] m : intervals) {
            Meeting meeting = new Meeting(m[0], m[1]);
            meetings.add(meeting);
        }

        meetings.sort(Comparator.comparingInt(a -> a.start));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(meetings.get(0).end);

        int i = 1;

        while(i < meetings.size()) {

            Meeting m = meetings.get(i);

            if (minHeap.peek() <= m.start) {
                minHeap.remove();

            }

            minHeap.add(m.end);
            i++;
        }
        return minHeap.size();
    }
}

class Meeting {
    int start;
    int end;

    Meeting(int s, int e) {
        start = s;
        end = e;
    }
}