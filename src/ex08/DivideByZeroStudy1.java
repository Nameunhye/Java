package ex08;

public class DivideByZeroStudy1 {

    static void divide(int n) {
        int result = 10 / n;
        System.out.println("결과는 " + result);
    }

    public static void main(String[] args) {

        try {
            divide(1);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램은 계속 진행됩니다.");
        // finally 블록은 오류의 유무와 상관없이 진행된다.
    }
}
