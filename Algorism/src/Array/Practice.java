package Array;

// 기본 배열 자료형을 이용한 배열의 생성, 삽입, 삭제 기능 구현

import java.util.Arrays;

class MyArray {
    int[] arr;
    
    // 배열의 초기 사이즈 설정
    MyArray(int size) {
        this.arr = new int[size];
    }
    
    // 배열에 데이터 삽입
    public void insertDate(int index, int data) {
        // 예외처리 (인덱스가 0이거나 배열의 범위를 벗어난 경우)
        if (index < 0 || index > this.arr.length) {
            System.out.println("Index Error");
            return;
        }

        // 데이터를 이동하고 삽입
        // 1. 배열 복사
        int[] arrDup = this.arr.clone();
        // 2. 새로운 배열 생성
        this.arr = new int[this.arr.length + 1];

        // 3. 기존 배열의 데이터 이전
        for (int i = 0; i < index; i++) {
            this.arr[i] = arrDup[i];
        }

        for (int i = index + 1; i < this.arr.length; i++) {
            this.arr[i] = arrDup[i - 1];
        }

        // 4. 삽입 위치 인덱스 데이터 추가
        this.arr[index] = data;
    }
    
    // 배열에서 특정 데이터 삭제
    public void removeData(int data) {
        int targetIndex = -1;

        // 배열 안에 데이터가 있는지 탐색
        for (int i = 0; i < this.arr.length; i++) {
            // 데이터가 있으면 targetIndex 변경
            if (this.arr[i] == data) {
                targetIndex = i;
                break;
            }
        }

        // 배열 안에 타겟이 없는 경우
        if (targetIndex == -1){
            System.out.println("해당 데이터가 없습니다.");
        } else {
            // 삭제 진행
            // 1. 데이터 백업
            int[] arrDup = this.arr.clone();
            // 2. 새로운 배열 생성
            this.arr = new int[this.arr.length - 1];

            // 3. targetIndex의 데이터 제외 나머지 데이터 이전
            for (int i = 0; i < targetIndex; i++) {
                this.arr[i] = arrDup[i];
            }

            for (int i = targetIndex; i < this.arr.length; i++) {
                this.arr[i] = arrDup[i + 1];
            }
        }
    }
}

public class Practice {
    
    public static void main(String[] args) {

        // Test code
        int size = 5;
        MyArray myArray = new MyArray(size);

        for (int i = 0; i < size; i++) {
            myArray.arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(myArray.arr)); // [1, 2, 3, 4, 5]

        myArray.arr[0] = 10;
        System.out.println(Arrays.toString(myArray.arr)); // [10, 2, 3, 4, 5]

        myArray.insertDate(2, 20);
        System.out.println(Arrays.toString(myArray.arr)); // [10, 2, 20, 3, 4, 5]

        myArray.insertDate(6, 60);
        System.out.println(Arrays.toString(myArray.arr)); // [10, 2, 20, 3, 4, 5, 60]

        myArray.insertDate(-1, 0); // Index Error

        myArray.removeData(4);
        System.out.println(Arrays.toString(myArray.arr)); // [10, 2, 20, 3, 5, 60]

        myArray.removeData(5);
        System.out.println(Arrays.toString(myArray.arr)); // [10, 2, 20, 3, 60]

        myArray.removeData(99); // 해당 데이터가 없습니다.



        
    }
}
