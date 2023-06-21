package ex13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set02 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));

        // s1.retainAll(s2);
        // System.out.println(s1);
        // // 교집합(중복값)

        // s2.addAll(s1);
        // System.out.println(s2);
        // // 합집합(두 집합을 더한 값. 중복값은 1개만)

        s1.removeAll(s2);
        System.out.println(s1);
        System.out.println(s2);
        // 차집합(s1-s2값)
        // removeAll() 메소드는 Set객체에서 호출되는 것이 중요하다.
        // 차집합을 통해 호출 대상인 Set 컬렉션의 객체가 변경된다.(s1)
        // 제거할 대상인 다른 set 컬렉션은 변경되지 않는다.(s2)
    }
}
