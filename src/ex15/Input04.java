package ex15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// buffer

public class Input04 {
    public static void main(String[] args) {

        // 연결(키보드)
        try {
            InputStream in = new FileInputStream("input.txt");
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);

            String allData = " ";
            while (true) {
                String data = br.readLine();
                allData = allData + data;
                // readLine의 data가 while을 도는 동안, allData에 차곡차곡 쌓여서

                if (data == null)
                    break;
                // data가 더이상 없을 때 해당 while은 종료된다.
            }
            System.out.println(allData);

            // String data = br.readLine(); // 이미 버퍼에서 각 App이나 OS에 데이터를 전달 후 버퍼를 비운다.(한번
            // 전달하면 비우는 것 반복)
            // System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
