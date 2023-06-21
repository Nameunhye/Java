package ex13;

import java.util.*;

public class Set03 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        // HaseSet으로 <String> 타입만을 저장
        String[] sample = { "사과", "사과", "바나나", "토마토" };
        // sample의 String 배열이 존재하는데,

        // sample의 배열을 1개씩 돌면서
        for (String a : sample) {
            /*
             * s.add(a) : Set's'에 a요소를 추가하는 메소드
             * 이 메소드는 추가 성공 시 : true / 실패시 : false
             * 그럼 원래 true 한 값만 출력이 되어야 하는데
             * !를 이용해서 true -> false / false -> true로 변경
             * 그래서 남은 a값은 false값이다.
             */
            if (!s.add(a))
                System.out.println("중복된 단어 : " + a);
        }
        System.out.println(s.size() + "중복되지 않은 단어 : " + s);
    }
}
