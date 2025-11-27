package kz.seisen;

import kz.seisen.block6.MeetingRooms;
import kz.seisen.block7.Islands;

public class Main {
    public static void main(String[] args) {

        // Technical Block 6

        int[][] meetings = {
                {10, 20},
                {15, 25},
                {30, 40},
                {35, 50}
        };
        System.out.println(MeetingRooms.minMeetingRooms(meetings)); // 2



        // Technical Block 7

        int[][] map = {
                {1,1,0,0,0},
                {1,0,0,1,1},
                {0,0,0,1,1},
                {1,0,1,0,0}
        };

        System.out.println(Islands.numIslands(map)); // 4
    }
}