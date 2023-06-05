package ex03;

public class MyStar03 {

    public static void main(String[] args) {
        // __*__
        // _***_
        // *****
        // _***_
        // __*__

        // __*__
        // System.out.println(""+""+"*"+""+"");
        int i = 0;
        int a = 0;
        // 첫번째 i의 크기는 5까지
        // a - 1은 2 > 1 > 0으로 된다. 그러면 a는 2
        for (i = 0; i < 1; i++) {
            for (a = 0; a < 2; a++) {
                System.out.print(" ");
            }
            for (a = 0; a < 1; a++) {
                System.out.print("*");
            }
            for (a = 0; a < 2; a++) {
                System.out.print(" ");
            }
        }
        System.out.println("");

        // // _***_
        // System.out.println(" " + "***" + " ");
        for (i = 0; i < 1; i++) {
            for (a = 0; a < 1; a++) {
                System.out.print(" ");
            }
            for (a = 0; a < 3; a++) {
                System.out.print("*");
            }
            for (a = 0; a < 1; a++) {
                System.out.print(" ");
            }
        }
        System.out.println("");

        // // *****
        // System.out.println("*****");
        for (i = 0; i < 1; i++) {
            for (a = 0; a < 0; a++) {
                System.out.print(" ");
            }
            for (a = 0; a < 5; a++) {
                System.out.print("*");
            }
            for (a = 0; a < 0; a++) {
                System.out.print(" ");
            }
        }
        System.out.println("");

        // // _***_
        // System.out.println(" " + "***" + " ");.
        for (i = 0; i < 1; i++) {
            for (a = 0; a < 1; a++) {
                System.out.print(" ");
            }
            for (a = 0; a < 3; a++) {
                System.out.print("*");
            }
            for (a = 0; a < 1; a++) {
                System.out.print(" ");
            }
        }
        System.out.println("");

        // // __*__
        // System.out.println(" " + "*" + "");
        for (i = 0; i < 1; i++) {
            for (a = 0; a < 2; a++) {
                System.out.print(" ");
            }
            for (a = 0; a < 1; a++) {
                System.out.print("*");
            }
            for (a = 0; a < 2; a++) {
                System.out.print(" ");
            }
        }
        System.out.println("");

    }
}
