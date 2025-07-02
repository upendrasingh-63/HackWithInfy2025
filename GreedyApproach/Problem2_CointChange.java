package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2_CointChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = { 1, 2, 5, 10, 20, 50, 100 };
        Arrays.sort(coins);

        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (n >= coins[i]) {
                n -= coins[i];
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
