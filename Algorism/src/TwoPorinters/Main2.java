package TwoPorinters;

import java.util.Scanner;

/**
 * 백준 실버4 2003 수들의 합2
 * N개의 수로된 수열 i번째부터 j 번째의 합이 M이 되는 경우의 수 구하기
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int result = 0;

        while (p1 < n) {
            if (sum == m) {
                result++;
                p1++;
                sum -= arr[p1 - 1];
            } else if (sum > m || p2 >= n) {
                p1++;
                sum -= arr[p1 - 1];
            } else {
                p2++;
                sum += arr[p2 - 1];
            }
        }
        System.out.println(result);
    }
}
