package exam2;

import java.security.DrbgParameters.Reseed;

public class JavaCafe {
    public static void main(String[] args) {
        // printPay(10.00, 40);
        // printPay(10.00, 50);
        // printPay(7.50, 38);
        // printPay(8.50, 66);
        printPay(10, 41);
    }

    // 시급과 일한 시간을 입력받아, 주급을 출력
    public static void printPay(double basePay, int hours) {
        if (basePay < 8) {
            System.out.println("최저 시급 에러!");
            return;
        } else if (hours > 60) {
            System.out.println("초과 근무시간 에러!");
            return;
        }
        // 예외시킬 내용

        double pay = basePay * hours;
        // if문을 사용하기 보다는 간단하게 언급하기
        if (hours > 40) {
            pay = pay + (hours - 40) * basePay * 0.5;
        }

        System.out.printf("$ %.2f\n", pay);
    }
}
