package ex04;

import java.util.Scanner;

public class con04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("정수를 입력하시오:");
        n = sc.nextInt();

        if (0 == n % 2) {
            System.out.println("입력된 정수는 짝수입니다.");
        } else {
            System.out.println("입력된 정수는 홀수입니다.");

        }

    }

}
