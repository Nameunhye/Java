package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input02 {
    public static void main(String[] args) {

        // 연결 (키보드)
        InputStreamReader ir = new InputStreamReader(System.in);
        // 1. 아스키코드가 아닌 바로 문자로 읽는다. 2. 배열을 만들어서 큰 데이터를 받을 수 있다.
        // 단점 : 제한된 데이터에는 사용하기 좋으나, 미리 데이터 크기를 생각하고 써야한다.

        // 읽기
        try {
            char[] ch = new char[5];
            ir.read(ch);
            // 배열의 크기만큼 데이터를 받는다.

            for (char c : ch) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
