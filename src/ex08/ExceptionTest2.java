package ex08;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest2 {

    public static void main(String[] args) throws IOException {
        // 발생 예정인 오류를 해당 클래스에서 예외처리하지 않고,
        // throws를 통해 상위 IOException에게 책임을 넘기는 것이다.
        FileReader fr = new FileReader("test.txt");
        char[] a = new char[50];
        fr.read(a);
        for (char c : a) {
            System.out.print(c);
        }
    }
}
