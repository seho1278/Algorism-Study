package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 백준 실버1 1931 회의실 배정
 * 겹치지 않게 회의실을 사용할 수 있는 회의의 최대 수 구하기
 */

class Activity {
    int start;
    int end;
    public Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Activity> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Activity(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(list, (x1, x2) -> {
            // 종료시간이 같을 경우 시작시간을 비교
            if (x1.end == x2.end) {
                return x1.start - x2.start;
            }
            return x1.end - x2.end;
        });

        int cnt = 0;
        int curTime = 0;

        for (Activity activity : list) {
            if (curTime <= activity.start) {
                curTime = activity.end;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
