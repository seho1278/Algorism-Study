package Algorism.Sorting;

import java.util.Scanner;

/**
 * 백준 실버3 24060 알고리즘 수업 - 병합 정렬 1
 * N개의 서로 다른 양의 정수가 저장된 배열 A가 있을 때 병합 정렬로 배열 A를 오름차순 정렬할 경우
 * 배열 A에 K번째 저장되는 수를 구하기
 * 저장 횟수가 K보다 작으면 -1 출력
 */

public class Main {

    static int K;
    static int cnt = 0;
    static int result = -1;

    public static void mergeSort(int[] arr, int[] tmp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, tmp, left, mid);
            mergeSort(arr, tmp, mid + 1, right);
            merge(arr, tmp, left, mid, right);
        }
    }

    public static void merge(int[] arr, int[] tmp, int left, int mid, int right) {
        int p = left;
        int q = mid + 1;
        int idx = p;
        while (p <= mid && q <= right) {
            if (arr[p] <= arr[q]) {
                tmp[idx++] = arr[p++];
            } else {
                tmp[idx++] = arr[q++];
            }
        }
        while (p <= mid) {
            tmp[idx++] = arr[p++];
        }
        while (q <= right) {
            tmp[idx++] = arr[q++];
        }

        for (int i = left; i <= right; i++) {
            cnt++;
            if (cnt == K) {
                result = tmp[i];
                break;
            }

            arr[i] = tmp[i];
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        K = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] tmp = new int[n];
        mergeSort(arr, tmp, 0, n - 1);
        System.out.println(result);
    }
}
