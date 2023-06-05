package ex04;

import java.util.*;

public class for04 {
    public static void main(String[] args) {

        long gob = 1;
        int n;
        // n!의 값의 범위를 크게 하기 위해 long을 사용하고, 그 값의 결과를 gob으로 칭하며 시작은 1부터 시작한다(0을 곱하면 0)
        // n!(기입)의 값은 정수로 표현한다.

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하시요:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i = i + 1) {
            gob = gob * i;
            // 반복의 시작을 i=1, i는 n!까지의 숫자이므로 i <= n, i는 1씩 커지니까 i+1 예) 1*2*3*4*...
            // gob은 앞의 gob * 1씩 커지는 숫자 i를 곱하면
            // 예) 1=1*1 > 1=1*2 > 2=1*3 > 6=1*4 ......

            System.out.println(n + "!은 " + gob + " 입니다.");
            sc.close();

        }

    }
}
