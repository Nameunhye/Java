package ex04;

public class for06 {
    public static void main(String[] args) {

        for (int y = 0; y < 5; y++) {
            // 첫번째 for 나열은 세로로
            for (int x = 0; x < 10; x++)
                // 두번째 for 나열은 가로로
                System.out.print("*");
            // 1,2번째 결과값 * 주의주의 :::: print랑 println이랑 다르다
            // print : 모니터화 하는 것(실행-표현)
            // println : 모니터화 하는 것(실행-표현) + "강제 칸 띄어쓰기가 됨"

            System.out.println("");
            // 첫번째 for 나열 간의 칸 띄우는 것

        }
    }
}
