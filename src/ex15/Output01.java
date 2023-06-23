package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

// 콘솔에 먼저 쓰기
public class Output01 {
    public static void main(String[] args) {
        OutputStream os = System.out;
        // 모니터에 화면출력을 하려면 우리는 써야한다 = write
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);

        try {
            bw.write("안녕");
            bw.flush(); // 키보드 -> 모니터(OS) 출력해야하기 때문에 전달

            // 버퍼통신은 데이터의 끝에 "안녕\n" 해줘야 데이터의 끝인 것을 안다.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
