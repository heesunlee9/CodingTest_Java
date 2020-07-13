//https://pridiot.tistory.com/68

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
  public static void main(String[] args) {
    Queue q = new LinkedList(); // Queue 의 인터페이스 구현체인 LinkedList 를 사용
    q.offer("0");
    q.offer("1");
    q.offer("2");

    if(!q.isEmpty()) {
      System.out.println(q.peek());
    }

    while(!q.isEmpty()) {
        System.out.println(q.poll());
    }
  }
}
