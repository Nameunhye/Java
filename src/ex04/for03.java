package ex04;

public class for03 {
    public static void main(String[] args) {
        int sum = 0;
        // sum은 정수로 0이라고 표현을 한 다음

        for (int num = 1; num <= 10; num = num + 1) {
            sum = sum + num;
            // sum은 이전 sum + 다음 (num+1)이 붙기 때문에

            System.out.println("1부터 10까지의 정수의 합 = " + sum);
        }
    }
}
