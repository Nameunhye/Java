package ex04;

import java.util.*;

public class for05 {
    public static void main(String[] args) {

        // 약수는 n에 1부터 나눠봐서 나머지가 '0'이 나오면 약수라고 한다.
        // n = 정수, 1부터 나누는 것은 i라고 지칭, 범위는 i는 <=n, i는 1씩 커진다.
        // 0이 나오는 조건은, n에 i를 나눠서 나머지를 확인해보는 법

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수를 입력하시오: ");
        n = sc.nextInt();

        System.out.println(n + "의 약수는 다음과 같습니다.");
        for (int i = 1; i <= n; i = i + 1) {
            if (n % i == 0)

                System.out.println(" " + i);

            // for문은 나열하는 키워드로, ""+i만 해도 약수를 나열해 줄 것이다.

            sc.close();
        }

    }
}
