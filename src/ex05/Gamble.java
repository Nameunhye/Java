package ex05;

public class Gamble {
    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();
        double won = exchange(dollar);
        System.out.printf("획득 금액 : $%.2f(%.0f원)", dollar, won);

    }

    public static int dice() {
        double randomnumber = Math.random();
        int random = (int) (randomnumber * 6) + 1;
        return random;
    }

    public static double exchange(double dollar) {
        return dollar * 1082.25108;
    }

}
