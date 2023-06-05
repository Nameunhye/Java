package ex05;

public class ProgrammingGrades {
    public static void main(String[] args) {
        int score1 = 12;
        int score2 = 24;
        System.out.printf("%d점 -> %s\n", score1, grade1(score1));
        System.out.printf("%d점 -> %s\n", score2, grade1(score2));

    }

    public static String grade1(int score1) {
        if (score1 >= 95) {
            return "A+";
        } else if (score1 >= 90) {
            return "A0";
        } else if (score1 >= 80) {
            return "B+";
        } else if (score1 >= 70) {
            return "B0";
        } else {
            return "C+";
        }
    }

}
