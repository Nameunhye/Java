package ex04;

public class coin03 {
    final int money = 120005160; // scanner 로 수정하기
    int restMoney = money; // 남은 금액 변수 만들기
    int count; // 동전 개수를 담을 변수

    void printRestMoney(int m) { // 행위
        count = restMoney / m;
        System.out.println(m + "원 : " + count);
        restMoney = restMoney % m;
    }

    public static void main(String[] args) {
        coin03 c2 = new coin03(); // 재사용 가능한 메서드를 만들어서 new로 호출해서 사용한다.
        c2.printRestMoney(500); // 위의 class 메서드를 가지고 오고 m을 지정해준다.
        c2.printRestMoney(100);
        c2.printRestMoney(50);
        c2.printRestMoney(10);

    }
}