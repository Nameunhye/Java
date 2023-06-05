package ex04;

public class con01 {
    public static void main(String[] args) {
        System.out.println(1 == 1);
        int point = 75;
        // 자바는 무조건 타입을 써줘야 한다.
        if (point > 80) {
            System.out.println("A학점");
            // true면 {}- if body(위의 "A학점")가 실행되고, false는 실행이 안된다.
        } else {
            System.out.println("미달입니다.");
        }
        // if(조건){실행}else{} - if-else 기본구조

    }

}
