package ex03;

import java.util.Scanner;
// import : 자바의 라이브러리 패키지의 클래스를 사용하거나 사용자의 다른 패키지 안의 클래스를 사용할 때 import 명령어를 사용하면 클래스 이름으로 사용할 수 있게 해주는 명령어입니다
// import로 한 번 지정해 놓으면 쓸 때마다 패키지명을 작성할 필요가 없다.

// 키보드에서 java로 통신이 연결될 때, Scanner을 써서 변환시켜주는데 이렇게 도움을 주는 것을 Socket이라고 한다

public class Mem01 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); // System.in = 키보트, system.out = 모니터
        // 키보드로 입력할 것이다
        int x, y, sum; // int 변수 선언 

        System.out.print("첫 번째 숫자를 입력하시오"); x = a.nextInt(); // 키보드에 입력하면 값이 나온다, 값이 들어오기 전에는 실행되지 않고 멈춘다.

        System.out.print("두 번째 숫자를 입력하시오"); y = a.nextInt(); // 키보드에 입력하면 값이 나온다, 값이 들어오기 전에는 실행되지 않고 멈춘다.
        // 모니터에 보여라

        sum = x + y;
        System.out.println(sum);



    }
}