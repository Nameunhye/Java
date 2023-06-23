package ex08;

import java.io.FileReader;

// Try-With-Resource
// try-catch 블록 내에서 사용하는 리소스를 자동으로 닫는다.
// try(리소스 선언){}

// * 리소스는 사용하고 명시적으로 닫아줘야한다.
// 리소스 누수와 예외 처리 문제로 파일을 사용한 후에는 명시적으로 파일을 닫는 코드를 작성하여 리소스를 안전하게 해제해야 한다.

/*
 * 리소스를 닫아줘야 하는 대표적인 예시
 * 1. 파일 리소스
 * 2. 네트워크 연결 : socket, HttpURLConnection등
 * 3. 데이터베이스 커넥션 : connection, PreparedStatement, ResultSet
 * 4. 자원 할당 : 메모리 할당, 스레드 풀, 그래픽 리소스
 */

public class TryTest {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test.txt")) {
            char[] a = new char[50];
            // 길이가 50인 문자배열 a
            fr.read(a);
            for (char c : a) {
                System.out.print(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
            // 예외를 출력하는 메소드
            // 예외가 발생한 위치와 예외의 상세한 정보 콘솔에 안내한다.
        }
    }
}

/*
 * FileReader
 * 텍스트 파일의 문자 단위로 읽을 수 있다. new FileReader() <- fileName
 * FileReader 객체를 생성하면 파일을 열고 읽을 수 있다.
 * 
 * 위의 오류는, 파일 경로를 잘못 지정한 부분이다.
 */
