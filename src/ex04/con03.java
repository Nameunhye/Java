package ex04;

import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class con03 {
    final int ga = 0;
    final int ba = 1;
    final int bo = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가위(0), 바위(1), 보(2):");
        int user = sc.nextInt();

        int computer = (int) (Math.random() * 3);
        // int randomValue = (int) (Math.random() * 11); : 0부터 10까지의 정수 중에서 하나의 값을 선택이라는
        // 뜻
        // 컴퓨터가 0,1,2 중 하나의 값을 랜덤으로 선택할테니 위의 코드를 작성해놓기

        if (user == computer)
            System.out.println("인간과 컴퓨터가 비겼음");
        else if (user == (computer + 1) % 3)

            // 위의 함수는 결과가 나오는 패턴을 꼭 풀어보고 정리해서 작성해야 해서 노가다를 해야한다.

            System.out.println("인간" + user + " " + "컴퓨터" + computer + " = 인간 승리");
        else
            System.out.println("인간" + user + " " + "컴퓨터" + computer + " = 컴퓨터 승리");

    }

}
