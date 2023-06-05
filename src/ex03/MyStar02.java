package ex03;

public class MyStar02 {
    public static void main(String[] args) {
        int a = 0;
        int i = 0;
        int x = 6;

        for (a = 5; a > 0; a--) { // a--이걸 생각 못해봤니!!!!
            for (i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (a = 0; a < 5; a++) { // 행을 반복
            x = x - 1; // 조건은 실행의 위에 꼭!
            for (i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (a = 0; a < 5; a = a + 1) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (a = 0; a < 4; a = a + 1) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (a = 0; a < 3; a = a + 1) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (a = 0; a < 2; a = a + 1) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (a = 0; a < 1; a = a + 1) {
            System.out.print("*");
        }
        System.out.println(" ");

    }
}
