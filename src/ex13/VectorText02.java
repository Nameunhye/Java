package ex13;

import java.util.*;

public class VectorText02 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>(2);
        // Vector<>의 <>에 원하는 타입의 객체만 넣어 저장하는 Vector를 생성할 수 있다.

        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        System.out.println("vector의 size : " + vec.size());
        Collections.sort(vec);
        // vec의 정렬을 수행
        // 문자열의 사전식 순서를 기준으로 수행하며, 오름차순이다.
        // 내림차순 : Collections.reverse();

        for (String s : vec) {
            System.out.println(s + " ");
        }

    }
}
