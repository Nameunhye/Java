package ex03;

public class While01 {
    public static void main(String[] args) {
        // for -> 끝이 있는 반복문
        // while - > 끝을 모르는 반복문

        int i = 1; // while 전에 선언
        while (true) {
            if (i == 100) {
                break; // 조건식은 실행되기 전에 필터링을 하는 느낌으로. 실행되기 전 위치
            }
            System.out.println("Hello World : " + i);
            i = i + 1;
        }
    }
}
