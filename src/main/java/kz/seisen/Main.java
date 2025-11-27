package kz.seisen;

import kz.seisen.block6.MeetingRooms;
import kz.seisen.block7.Islands;
import kz.seisen.block8.Discounts;

import java.util.List;

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


        // Technical Block 8

        int[][] discounts = {
                {1, 5, 10},
                {3, 6, 20},
                {7, 8, 15}
        };

        List<int[]> merged = Discounts.mergeDiscounts(discounts);
        for (int[] d : merged) {
            System.out.println("Day " + d[0] + " -> Discount " + d[1]);
        }
    }
}