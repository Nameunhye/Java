package Exam;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        int x, y, sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하시오 : ");
        x = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하시오 : ");
        y = sc.nextInt();

        sum = x + y;
        System.out.println(sum);

    }
}
