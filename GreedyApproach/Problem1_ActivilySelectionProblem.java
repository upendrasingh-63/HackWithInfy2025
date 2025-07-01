package GreedyApproach;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//functional interface
//lambda function, stream api

public class Problem1_ActivilySelectionProblem {

    static class Activity {
        int start;
        int end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Activity[] activities = new Activity[n];
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            activities[i] = new Activity(start, end);
        }
        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

        int count = 1;
        int last = activities[0].end;
        for (int i = 0; i < activities.length; i++) {
            if (activities[i].start >= last) {
                count++;
                last = activities[i].end;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
