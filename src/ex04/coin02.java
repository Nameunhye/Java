package ex04;

public class coin02 {

    void printRestMoney() { // 행위
        // {}의 내용은 printRestMoney stack에 저장 - 아래랑 메모리 공간이 달라져서 main {}내용을 들고 오면 오류난다
        // 이럴때는 new를 이용한다

    }

    // static void >> static에 저장
    // static 없이 class 안에 있다면 heap에 저장
    // static안에는 heap 변수를 넣을 수 없다
    // 3개의 다른 공간의 메모리는 불러오려면 new를 사용해서 메모리를 불러와야 한다.

    public static void main(String[] args) {
        // {}의 내용은 main stack에 저장
        final int money = 120005160;
        int restMoney = money;
        int count;

        int[] moneys = { 500, 100, 50, 10 };
    }
}
