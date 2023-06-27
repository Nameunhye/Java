package ex17;

import java.io.IOException;
import java.net.InetAddress;

// 소스를 입력하고 Ctrl + Shift + O 를 눌려서 필요한 파일을 포함한다.

public class ShapeTest {
    public static void main(String[] args) throws IOException {
        String hostname = "www.naver.com";

        try {
            InetAddress address = InetAddress.getByName(hostname);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
/*
 * InetAddress()
 * 
 */
