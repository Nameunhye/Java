package ex03;

public class MyStar01 {
    public static void main(String[] args) {
        int a = 0;
        int i = 0;
        int x = 0;

        // 최종 리팩토링 - x = x + 1대신에 a에 첫 값을 1로 넣고, a 처음 실행시 i는 0(별 없음), 두번째 실행시 별 1개 이러니까
        for (a = 1; a < 6; a++) {
            for (i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // 리팩토링
        for (a = 0; a < 5; a++) { // 행을 반복
            x = x + 1; // 조건은 실행의 위에 꼭!
            for (i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // +1씩 됨
        // 1자리를 x라고 한다면 x는 1씩 증가한다
        for (a = 0; a < 1; a = a + 1) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (a = 0; a < 2; a = a + 1) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (a = 0; a < 3; a = a + 1) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (a = 0; a < 4; a = a + 1) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (a = 0; a < 5; a = a + 1) {
            System.out.print("*");
        }
        System.out.println(" "); // 이건 반복되면 안되므로

        // 띄어쓰기랑 *, **, ***, ****, *****

    }

}
