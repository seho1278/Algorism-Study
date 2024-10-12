package DP;

import java.util.Scanner;

/**
 * 백준 실버3 1003 피보나치 함수
 */

public class Main {

    static int[][] dp = new int[41][2];

    public static int[] fib(int n) {
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        return dp[n];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(fib(n)[0] + " " + fib(n)[1]);
        }
    }
}
