package LinearDataStructure.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack); // [1, 2, 3, 4, 5]

        System.out.println(stack.pop()); // 5
        System.out.println(stack); // [1, 2, 3, 4]

        // pop 은 가장 마지막의 들어간 수를 꺼낸다
        System.out.println(stack.pop()); // 4
        System.out.println(stack); // [1, 2, 3]

        // peek 는 가장 마지막에 들어간 수를 반환 
        System.out.println(stack.peek()); // 3
        System.out.println(stack); // [1, 2, 3]

        // 포함관계 확인 boolean
        System.out.println(stack.contains(1)); // true

        // 스택의 크기
        System.out.println(stack.size()); // 3

        // 스택이 비어있는지 확인 boolean
        System.out.println(stack.empty()); // false

        stack.clear(); // 스택 비우기
        System.out.println(stack); // []
        stack.pop(); // EmptyStackException 예외 발생
    }
}
