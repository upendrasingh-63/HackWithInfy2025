package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            if ((a + b + c) == (x + y)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            // long[] target = { x, y };
            // Arrays.sort(target);
            // long targetX = target[0];
            // long targetY = target[1];

            // boolean possible = false;

            // if (c == targetX) {
            // long k = targetY - b;
            // if (k >= 0 && k <= a) {
            // possible = true;
            // }
            // }
            // if (!possible && c == targetY) {
            // long k = targetX - b;
            // if (k >= 0 && k <= a) {
            // possible = true;
            // }
            // }

            // if (!possible) {
            // if (b == targetX) {
            // long k = targetY - c;
            // if (k >= 0 && k <= a) {
            // possible = true;
            // }
            // }
            // if (!possible && b == targetY) {
            // long k = targetX - c;
            // if (k >= 0 && k <= a) {
            // possible = true;
            // }
            // }
            // }

            // if (!possible) {
            // if (c == targetX) {
            // long k = targetY - a;
            // if (k >= 0 && k <= b) {
            // possible = true;
            // }
            // }
            // if (!possible && c == targetY) {
            // long k = targetX - a;
            // if (k >= 0 && k <= b) {
            // possible = true;
            // }
            // }
            // }

            // if (!possible) {
            // if (a == targetX) {
            // long k = targetY - c;
            // if (k >= 0 && k <= b) {
            // possible = true;
            // }
            // }
            // if (!possible && a == targetY) {
            // long k = targetX - c;
            // if (k >= 0 && k <= b) {
            // possible = true;
            // }
            // }
            // }

            // if (!possible) {
            // if (b == targetX) {
            // long k = targetY - a;
            // if (k >= 0 && k <= c) {
            // possible = true;
            // }
            // }
            // if (!possible && b == targetY) {
            // long k = targetX - a;
            // if (k >= 0 && k <= c) {
            // possible = true;
            // }
            // }
            // }

            // if (!possible) {
            // if (a == targetX) {
            // long k = targetY - b;
            // if (k >= 0 && k <= c) {
            // possible = true;
            // }
            // }
            // if (!possible && a == targetY) {
            // long k = targetX - b;
            // if (k >= 0 && k <= c) {
            // possible = true;
            // }
            // }
            // }

            // if (possible) {
            // System.out.println("Yes");
            // } else {
            // System.out.println("No");
            // }
        }
        sc.close();
    }
}
