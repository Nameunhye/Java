package ex08;

public class DivideByZero3 {

    // 0으로 나누면 분명 오류가 날껀데, 그 제어는 사용자에게 맡기고 싶다.

    // Exception을 throws를 해 놓으면 개발자가 try/catch를 하지 않아도
    // 오류를 Exception에게 권한을 넘긴다.(Exception에게 강제성을 부여. 책임전가)
    static void divide(int n) throws Exception {

        int result = 10 / n;
        System.out.println("나눗셈 결과 : " + result);

    }

    public static void main(String[] args) {
        try {
            divide(0);
        } catch (Exception e) {
            System.out.println(e.getMessage() + ": 0으로 나눌 수 없습니다.");
        }
        // main에 throws를 하면 JVM에게 권한을 넘기는 것이므로, 피하도록 하자.

    }

}
