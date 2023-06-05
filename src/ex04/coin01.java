package ex04;

import java.util.Scanner;

public class coin01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("잔돈을 입력하시오 : ");
        final int money = sc.nextInt();
        int restmoney = money;
        int count = 0;
        int[] tempmoney = { 500, 100, 50, 10 }; // 0, 1, 2, 3

        for (int a = 0; a < tempmoney.length; a++) {
            // a++ = 저장공간 4byte가 연결되어 있고, 0,1,2,3 +1씩 index 번호가 커지기 때문에
            count = restmoney / tempmoney[a];
            restmoney = restmoney % tempmoney[a];
            System.out.println(tempmoney[a] + "원 : " + count);
        }

        // for(int m : tempmoney) {
        // count = restmoney / m;
        // System.out.println(m + "원 : " + count);
        // restmoney = restmoney % m

    }

}
