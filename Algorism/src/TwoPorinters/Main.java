package TwoPorinters;

import java.util.Scanner;

/**
 * 백준 실버3 2559 수열
 * 연일된 온도의 합이 가장 큰 값 찾기
 */

public class Main {
    public static int twoPointers(int[] arr, int k) {
        int p1 = k;
        int p2 = 0;
        int sum = 0;
        int result = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
            result = sum;
        }

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];

            if (sum > result) {
                result = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(twoPointers(arr, k));
    }
}
