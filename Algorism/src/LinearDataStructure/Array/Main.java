package LinearDataStructure.Array;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1차원 배열
        int[] arr = {1, 2, 3, 4, 5};
        for (int item: arr) {
            System.out.println("item = " + item);
        }

        arr[1] = 100;
        System.out.println("arr = " + Arrays.toString(arr)); // arr = [1, 100, 3, 4, 5]
        
        // 2차원 배열
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr2[0][2]); // 3
        
        // 이차원 배열 출력
        for (int[] row: arr2) {
            for (int item: row) {
                System.out.println("item = " + item);
            }
        }

        // ArrayList - 1차원, 2차원
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println("list1 = " + list1); // list1 = [1, 2, 3]
        list1.add(4);
        list1.add(5);
        System.out.println("list1 = " + list1); // list1 = [1, 2, 3, 4, 5]

        // 2번 인덱스 제거
        list1.remove(2);
        System.out.println("list1 = " + list1); // list1 = [1, 2, 4, 5]

        // 2의 값을 가진 인덱스를 가져온 뒤 해당 인덱스 제거
        list1.remove(Integer.valueOf(2));
        System.out.println("list1 = " + list1); // list1 = [1, 4, 5]

        ArrayList list2d = new ArrayList();
        ArrayList list1d1 = new ArrayList(Arrays.asList(1, 2, 3));
        ArrayList list1d2 = new ArrayList(Arrays.asList(4, 5, 6));

        // 배열을 추가할 수 있다.
        list2d.add(list1d1);
        list2d.add(list1d2);
        System.out.println("list1d1 = " + list1d1); // list1d1 = [1, 2, 3]
        System.out.println("list1d2 = " + list1d2); // list1d2 = [4, 5, 6]
        System.out.println("list2d = " + list2d); // list2d = [[1, 2, 3], [4, 5, 6]]
    }
}
