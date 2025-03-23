package NonLinearDataStructure.PriorityQueue;

// 문자열 사전식 오름차순 or 내림차순

import java.util.PriorityQueue;

class Person3 {
    String name;
    int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Practice3 {
    public static void solution(String[] name, int[] age) {
        PriorityQueue<Person3> pq = new PriorityQueue<>((Person3 p1, Person3 p2) -> p2.name.compareTo(p1.name));

        for (int i = 0; i < name.length; i++) {
            pq.offer(new Person3(name[i], age[i]));
        }

        while (!pq.isEmpty()) {
            Person3 p = pq.poll();
            System.out.println(p.name + " " + p.age);
        }
    }

    public static void main(String[] args) {
        String[] name = {"A", "B", "C", "D", "E"};
        int[] age = {30, 20, 45, 62, 35};

        solution(name, age);
    }
    
}
