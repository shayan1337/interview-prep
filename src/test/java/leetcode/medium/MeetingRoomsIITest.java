package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeetingRoomsIITest {

    @Test
    void testMeetingRooms() {
        int[][] meetings = {{0, 30}, {5, 10}, {15, 20}};
        int res = MeetingRoomsII.minMeetingRooms(meetings);

        assertEquals(2, res);
    }

    @Test
    void testMeetingRooms2() {
        int[][] meetings = {{7, 10}, {2, 4}};
        int res = MeetingRoomsII.minMeetingRooms(meetings);

        assertEquals(1, res);
    }

}