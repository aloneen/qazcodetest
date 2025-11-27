package kz.seisen;

import kz.seisen.block6.MeetingRooms;

public class Main {
    public static void main(String[] args) {
        int[][] meetings = {
                {10, 20},
                {15, 25},
                {30, 40},
                {35, 50}
        };
        System.out.println(MeetingRooms.minMeetingRooms(meetings)); // 2
    }
}