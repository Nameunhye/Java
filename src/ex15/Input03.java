package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// buffer

public class Input03 {
    public static void main(String[] args) {

        // 연결 (키보드)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 데코레이터 패턴(코드 재사용으로 주입받아 사용)
        // 데이터 공간의 한계가 없이 무한으로 데이터 전송이 가능하다.

        // 읽기
        try {
            String data = br.readLine();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
