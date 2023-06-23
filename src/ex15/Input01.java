package ex15;

import java.io.IOException;
import java.io.InputStream;

public class Input01 {
    public static void main(String[] args) {
        // inputStream(부모) : input으로 어떤 것을 받아올 지 모르기 때문에 추상적이다.

        // 연결 (키보드) - 1byte만 읽는다.
        InputStream in = System.in;

        // 읽기, byte라서 int로 읽는다.
        // 실행되기 전에 오류가 날 수 있다는 경고 : complie exception
        // 실행시 오류가 날 수 있다는 경고 : runtime exception
        try {
            int data = in.read(); // 대기(데몬), 백그라운드 서비스; 리스너가 in.read();에서 데이터가 들어올 때 까지 대기하다가 들어오면 실행
            System.out.println(data); // "A"를 쓴 것에 대한 출력
            System.out.println((char) data); // "A"의 아스키코드를 다시 "A"로
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 실행 후 TERMINAL에 "A"를 입력하면, 아스키코드로 변경된다. 그리고 데몬 종료
        // 단점 : 1byte ; 즉 1글자만 받을 수 있다.

    }
}
