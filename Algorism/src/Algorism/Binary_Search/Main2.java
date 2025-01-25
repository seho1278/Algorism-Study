package Algorism.Binary_Search;

import java.util.Scanner;

/**
 * 백준 실버4 2417 정수 제곱근
 * 정수가 주어지면 그 수의 정수 제곱근을 구하는 프로그램 작성
 */

public class Main2 {

    public static long binarySearch(long left, long right, long target) {
        long mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if ((mid * mid) == target) {
                return mid;
            } else if (mid > 0 && mid > target / mid){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long left = 0L;
        long right = n;


        System.out.println(binarySearch(left, right, n));
    }
}
