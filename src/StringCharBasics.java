//https://kmj1107.tistory.com/entry/JAVA-%EB%AC%B8%EC%9E%90%EC%97%B4string-%EB%B9%84%EA%B5%90-equals%EC%99%80-%EC%9D%98-%EC%B0%A8%EC%9D%B4%EC%A0%90-equals%EC%9D%98-%EB%B0%98%EB%8C%80

// 문자열
// https://yeolco.tistory.com/30

public class StringCharBasics {
  public static void main(String[] args) {
    String str2;
    str2 = "hello";

    String str = "str1";

    String str3 = new String("str3");

    String str4 = new String();
    str4 = "str4";

    String str5 = "abcde";
    System.out.println(str5.length());

    String str6 = new String();
    if(str6.isEmpty())
      System.out.println("empty");
    else
      System.out.println("not empty");

    String str7 = new String("abcd");
    System.out.println(str7.charAt(0));
    System.out.println(str7.charAt(str7.length() - 1));

    String str8 = new String("abcd");
    char[] ch = new char[10];
    str8.getChars(0, 2, ch, 0);
    System.out.println(ch);

    String str9 = new String("aaa");
    String str10 = new String("bbb");
    System.out.println(str9.compareTo(str10)); // -1 리턴

    String str11 = new String("ccca");
    String str12 = new String("cccz");
    System.out.println(str11.compareTo(str12)); // -25

    // 내가 추가로 알아본 것
    String sample = "<<<><";
    char[] temp = sample.toCharArray();

//     반목문 돌리기 방법 1
//    for (int i = 0; i < temp.length; i++) {
//      System.out.println(temp[i]);
//    }

    // 반복문 돌리기 방법 2 : improved forloop
    for(char c : temp) {
      System.out.println(c);
      // 문자끼리 같은지 비교
      if(c == '<') {
        System.out.println("Here is <");
      }
    }

    // String 끼리 같은지 비교
    String first = "Marry Me";
    String second = new String("Marry Me");

    // 내용(값) 비교 - true
    if(first.equals(str2)) {
      System.out.println("equal");
    }

    // 주소값 비교 - false
    if(second == str2) {
      System.out.println("equal");
    }

    // (자바에서 문자열 비교를 ==연산자로 비교할 수 없습니다!). 문자열 (내용) 비교에는 equals!

    String[] str13 = { "dog", "cat", "banana" };
    for(String object : str13) System.out.println(object);

    // Coding Test : String 이 문제에서 주어짐. 그걸 string 을 이용해서 처리

    // 문자열 parsing 관련
    String str14 = new String("abcdefg");
    System.out.println(str14.substring(2, 6)); // cdef 출력
    System.out.println(str.substring(5)); // fg 출력

    // 특정 문자만 제거하기
    // 특정 문자가 문자열에서 등장하는 횟수
    // 문자열 자르기
  }
}
