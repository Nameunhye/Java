package ex03;

public class Mem06 {
    public static void main(String[] args) {
        int x = 0b00001101; // 0b를 붙이는 이유는 c언어에서 2진수를 표현할 때 붙인다
        int y = 0b00000100;

        System.out.println("x>>1=" + (x>>1) + "");
        // "x>>1"은 실행할 문구 + 그 값

        System.out.println("y<<3=" + (y<<3) + "");
        System.out.println("x>>>1=" + (x>>>1) + "");
        // 값은 이동하고 나오는 2진수를 10진수로 변환시킨 값이다


    }
    
}
