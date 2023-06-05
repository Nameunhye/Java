package ex03;

import java.util.*;
// java의 모든 패키지를 쓸 수 있다

public class Mem02 {
public static void main(String[] args) {
    String name; // name을 문자열로 표현할 것이다
    int age; // age를 정수로 표현할 것이다

    Scanner a = new Scanner(System.in,"");

    System.out.println("이름을 입력하시오: ");
    name = a.nextLine(); // 키보드로 작성하면 문자열로 표시된 단어가 name에 들어간다
    System.out.println("나이를 입력하시오: ");
    age = a.nextInt(); // 키보드로 작성하면 정수로 표시된 단어가 age에 들어간다

    System.out.println(name + "님 안녕하세요!"  + (age) + "살이시네요.");
    // 터미널 한글깨짐의 해결 방법 : https://blog.naver.com/odri1995/222980331936
    a.close();

}    // age 괄호는 없어도 되는 듯..

}
