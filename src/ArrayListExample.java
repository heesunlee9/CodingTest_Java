//https://pridiot.tistory.com/65?category=869931

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList list1 = new ArrayList(10);

    list1.add(1);
    list1.add(4);
    list1.add(0);
    list1.add(3);
    list1.add(5);
    list1.add(2);

    ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 1~4 위치에 저장된 객체 반환
    System.out.println(list2);

    // 오름차순으로 정렬
    Collections.sort(list1);
    Collections.sort(list2);
  }
}

