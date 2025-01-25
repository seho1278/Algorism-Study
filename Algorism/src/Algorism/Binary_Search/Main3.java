package Algorism.Binary_Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 실버4 10816 숫자 카드2
 * 수가 적혀있는 숫자 카드를 몇 개 가지고 있는지 구하기
 */

public class Main3 {
    public static int binarySearch(int[] arr, int target, boolean start) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (start) {
                if (target <= arr[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
        }

        return left;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            int startIdx = binarySearch(arr, target, true);
            int endIdx = binarySearch(arr, target, false);
            sb.append(endIdx - startIdx).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
