package kz.seisen.block6;

import java.util.*;

public class MeetingRooms {
    public static int minMeetingRooms(int[][] meetings) {
        int n = meetings.length;
        if (n == 0) return 0;

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = meetings[i][0];
            end[i] = meetings[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            if (start[i] < end[endIndex]) {
                rooms++;
            } else {
                endIndex++;
            }
        }

        return rooms;
    }


}
