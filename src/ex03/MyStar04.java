package ex03;

public class MyStar04 {
    public static void main(String[] args) {
        for (int a = 0; a < 3; a++) {
            for (int b = 2; b > a; b--) {
                System.out.print(" ");
            }
            for (int c = 0; c < a * 2 + 1; c++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int d = 1; d < 3; d++) {
            for (int e = 0; e < d; e++) {
                System.out.print(" ");
            }
            for (int f = 6; f > d * 2 + 1; f--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}