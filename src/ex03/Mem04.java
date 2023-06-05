package ex03;
import java.util.Scanner;

public class Mem04 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);

        System.out.println("초를 입력하십시오:");
        int time = b.nextInt(); 
        int min = (time/60);
        int sec = (time%60);

        System.out.println(time + "초는 " + min + "분 " + sec + "초입니다.");

        // 연산은 작은 단위부터 계산해 결과를 보면서 수정하기
        // 보고 싶은 결과에 맞는 키워드를 해준다

       }
    
}
