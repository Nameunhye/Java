package ex04;

public class Gugudan {
    public static void main(String[] args) {
        // 11*1 =11, 엔터 11*2 =22 ... 11 ~ 19단까지 요구사항

        for (int n = 11; n < 20; n = n + 1) {
            // n값을 정수로 표현하고 싶으니까 int를 사용하고 n은 증가해야 하니까
            // 그냥 n+1이 아닌 n=n+1로 해야한다.
            System.out.println(n + "*1 = " + (n * 1));
            System.out.println(n + "*2 = " + (n * 2));
            System.out.println(n + "*3 = " + (n * 3));
            System.out.println(n + "*4 = " + (n * 4));
            System.out.println(n + "*5 = " + (n * 5));
            System.out.println(n + "*6 = " + (n * 6));
            System.out.println(n + "*7 = " + (n * 7));
            System.out.println(n + "*8 = " + (n * 8));
            System.out.println(n + "*9 = " + (n * 9));
            // 고정 문구는 '*1~9 ='이며 그 외의 값은 n으로 정의해준다
            System.out.println();

        }

        // n값을 직접 입력하면 나오게 해보자
        // n값은 Scanner sc = new Scanner(System.in); n = sc.nextint();
        // 틀은 n + "*1 = " + (n * 1)

    }
}
// 멀티 커서 단축키 : ctrl + alt + 위아래
// System.out.println(); - 칸 띄우기
// 무조건 알고리즘 패턴을 읽어야 하고, 노가다 코드를 짜봐서 알고리즘패턴을 읽어야 한다.
