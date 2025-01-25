package Algorism.Sorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 백준 실버4 1920 수 찾기
 * N개의 정수 A[1], A[2], ... ,A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램 작성
 */

public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = arr.size() - 1;
            int target = sc.nextInt();
            int result = 0;
            while (left <= right) {
                int mid = (left + right) / 2;

                if (target < arr.get(mid)) {
                    right = mid - 1;
                } else if (target > arr.get(mid)) {
                    left = mid + 1;
                } else {
                    result = 1;
                    break;
                }
            }

            System.out.println(result);
        }
    }
}
