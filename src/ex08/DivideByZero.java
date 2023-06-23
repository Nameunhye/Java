package ex08;

// 사용자의 수준을 파악하지 못하므로, 미리 오류를 잡아줘야 한다.
// 아래의 방법은 피하도록

public class DivideByZero {

    static void divide(int n) {
        int result = 10 / n;
        System.out.println("나눗셈 결과 : " + result);
    }

    public static void main(String[] args) {
        try {
            divide(0);
        } catch (ArithmeticException e) { // Exception -> 최상위 부모 자리
            // ArithemticException의 더 부모인 Excption을 넣는 것이 더 좋다.
            // Ari도 Exception을 new하기 때문에, 거치는 것보다 바로 최상위 부모를 호출
            System.out.println(e.getMessage());
        }

    }

}
