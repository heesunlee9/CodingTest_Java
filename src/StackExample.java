import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // ok
        // Stack stack = new Stack();

        // 데이터 입력
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        // 데이터
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        stack.push(5);
        stack.push(4);
        stack.push(3);

        System.out.println(stack.size()); // 3

        if(!stack.isEmpty()) {
            System.out.println(stack.peek()); // 데이터를 빼지 않고 현재 가장 위에 위치하는 데이터 확인 - 3
        }

        System.out.println(stack.size()); // 확인 용

        // stack 에서 주어진 객체를 찾아서 그 위치를 반환, 못 찾으면 -1 을 반환
        // 배열과 달리 위치가 1부터 시작
        if(stack.search(4) != -1) {
            System.out.println(stack.search(4));
        }

        if(stack.search(2) != -1) {  // 안나옴.
            System.out.println(stack.search(2));
        }
    }
}
