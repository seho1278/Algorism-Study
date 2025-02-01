package LinearDataStructure.HashTable.Practice;

/*
참고 - Hashtable? HashMap?

사용 측면에선 둘이 같다
 */

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Practice8 {
    public static void main(String[] args) {
        // Hashtable
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(0, 10);
        System.out.println(ht.get(0));

        // HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 10);
        System.out.println(hm.get(0));

        // 다형성 둘다 Map interface를 사용하기 때문에 가져올 수 있음
        Map<Integer, Integer> map1 = ht;
        Map<Integer, Integer> map2 = hm;
        System.out.println(map1.get(0));
        System.out.println(map2.get(0));

        // Hashtable은 key 값에 null을 사용할 수 없음
//        ht.put(null, -999);
//        System.out.println(ht.get(null)); // 예외발생

        // HashMap은 key 값에 null 사용 가능
        hm.put(null, -999);
        System.out.println(hm.get(null)); // -999

        // Hashtable 과 HashMap 차이
        /*
        공통 : 둘다 Map 인터페이스를 구현한 것
        차이 : Key의 Null 사용 여부
                Hashtable : X
                HashMap : O

                Thread-safe
                Hashtable : O (멀티 스레드 환경에서 우수)
                HashMap : X (싱글 스레드 환경에서 우수)
                참고) synchronizedMap, ConcurrentHashMap 을 이용하면 HashMap을 Thread-safe하게 사용할 수 있음

                Thread란?
                CPU에 있는 Processor에는 작업을 처리하는 단위인 Thread가 있는데
                Thread는 하나만 있을 수 있고 여러개가 있을 수 있음
                멀티 스레드는 프로세서가 일을 할 수 있는 시간 안에서
                번갈아 가면서 스레드를 스위칭 해가면서 실행 (동시에 진행하는 것처럼 보임)

                코딩 테스트의 경우 멀티스레드 환경의 문제는 거의 나오지 않기 때문에
                HashMap 사용이 더 속도측면에서 좋음
                멀티 스레드 환경에서 key value 구조의 자료구조를 사용할 일이 있으면
                Hashtable을 사용하거나 synchronizedMap 등을 사용
         */
    }
}
