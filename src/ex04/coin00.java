package ex04;
// 자바는 모든 것이 class안에 있어야 한다 - 문법

// class 밖에 매서드를 만드는 것은 불가능
// 메서드 안에 메서드는 넣지 못한다.
// 메서드 - 행위(모듈화 된것) 행위의 내부는 stack, void printRestMoney (){} - 형태
public class coin00 {
    void printRestMoney() {
    }
    // class를 해야 무조건 heap에 저장됨, static이 붙지 않았기 때문에 static에 저장되지 않았다. stack에 저장되는 것은
    // {}안의 내용
    //

    public static void main(String[] args) {
        // 잔돈을 건네는 (500,100,50,10)4가지 동전 중에 최소 갯수의 동전을 달라는 고객의 요청 ; 최대한 500원짜리로 줘야 하고

        final int money = 2680; // scanner로 수정하기, 변경하면 안되는 변수
        int restMoney = money; // 남은 금액 변수 만들기
        int count; // 동전 개수를 담을 변수 : 500,100,50,10 4개의 목차

        int tempMoney;

        tempMoney = 500; // 500이거만 변수, for문에 동전을 다 넣어서(for문 내에 동전 4개로) 배열을 하면 코드가 깔끔해짐, 동전갯수(i번지로 꺼내기)
        count = restMoney / tempMoney; // 5
        System.out.println(tempMoney + "원:" + count);
        restMoney = restMoney % tempMoney; // or restMoney = restMoney % 5

        // 위 하나만 뜨게 정렬

        tempMoney = 100;
        count = restMoney / tempMoney; // 1
        System.out.println(tempMoney + "원:" + count);
        restMoney = restMoney % tempMoney;

        tempMoney = 50;
        count = restMoney / tempMoney; // 1
        System.out.println(tempMoney + "원:" + count);
        restMoney = restMoney % tempMoney;

        tempMoney = 10;
        count = restMoney / tempMoney; // 1
        System.out.println(tempMoney + "원:" + count);
        restMoney = restMoney % tempMoney;

        // 코드는 모듈화해서 통일시켜야한다.
        // 다른 값을 넣어서 오류가 없는지 확인해본다.

        // 코드 능력 늘리기
        // 1. 코드 실행의 성공
        // 2. 안에 숫자를 바꿔본다
        // 3. 응용해본다

        // 잔돈을 건네는 (500,100,50,10)4가지 동전 중에 최소 갯수의 동전을 달라는 고객의 요청 ; 최대한 500원짜리로 줘야 하고
        // 위의 데이터는 불변 -> final로 고정

    }
}
