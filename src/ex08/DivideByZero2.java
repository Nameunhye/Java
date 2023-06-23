package ex08;

public class DivideByZero2 {

    static void divide(int n) {

        try {
            int result = 10 / n;
            System.out.println("나눗셈 결과 : " + result);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

        int result = 10 / n;
        System.out.println("나눗셈 결과 : " + result);
    }

    public static void main(String[] args) {
        divide(0);
    }
}
