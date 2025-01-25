package Algorism.DP;

import java.util.Scanner;

/**
 * 백준 실버5 16395 파스칼의 삼각형
 * 파스칼의 삼각형은 이항계수를 삼각형 형태로 배열
 * 단순한 형태로, 파스칼의 삼각형은 다음과 같은 방법으로 만들 수 있다.
 * 1. N번째 행에는 N개의 수가 있다.
 * 2. 첫 번째 행은 1이다.
 * 3. 두 번째 행부터, 각 행의 양 끝의 값은 1이고, 나머지 수의 값은 바로 위 행의 인접한 두 수의 합이다.
 * 
 * 정수 n과 k가 주어졌을 때 파스칼의 삼각형에 있는 n번째 행에서 k번째 수를 출력하는 프로그램 작성
 * 이때, 이 수는 이항계수 C(n-1, k-1)임에 주의
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] dp = new int[n + 1][n + 1];

        dp[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        System.out.println(dp[n][k]);
    }
}
