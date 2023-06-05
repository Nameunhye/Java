package ex04;

import java.util.Scanner;

public class con02 {
    public static void main(String[] args) {
        int jumsu;

        Scanner a = new Scanner(System.in);
        // Scanner은 제일 마지막에 하는 걸로, 숫자는 임의로 강제로 넣어서 결과값을 확인하기

        System.out.println("성적을 입력하시오: ");
        jumsu = a.nextInt();

        System.out.println("학점:");
        if (jumsu >= 90)
            System.out.println("A");
        else if (jumsu >= 80)
            System.out.println("B");
        // 굳이 90 > jumsu >=80 을 할 필요가 없다. 왜냐하면 위의 조건에 90점 이상은 A를 주기 때문에
        else if (jumsu >= 70)
            System.out.println("C");
        else if (jumsu >= 60)
            System.out.println("D");
        else
            System.out.println("F");

    }

}
