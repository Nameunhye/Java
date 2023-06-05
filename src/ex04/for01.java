package ex04;

public class for01 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(i);
        }
        // 초기값은 1(for문이 실행될 때 딱 한번만 실행되며, 반복되지 않음)
        // 조건식과 증감식은 계속 반복됨
        // 초기 > 조건 > 포문 > 증가 > 포문 > 작업 > 증가 > ... true가 나올때까지 반복(조건의 true)

        for (int a = 5; a < 32; a = a + 1) {
            System.out.println(a);
        }
    }
}
// ctrl c : 강제종료