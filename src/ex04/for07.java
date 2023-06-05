package ex04;

public class for07 {
    public static void main(String[] args) {

        // break 문
        for (int i = 1; i < 9; i++) {
            if (i == 4)
                break;
            // if (i=4)일 때, 반복을 멈춤
            System.out.println(i);
        }

        // countinue 문
        for (int i = 1; i < 9; i++) {
            if (i == 4)
                continue;
            // if (i=4)일 때, 4는 빼고 반복
            System.out.println(i);
        }

    }
}
