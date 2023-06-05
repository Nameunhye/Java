package ex05;

//메서드의 return

// 실제로는 Account라는 다른 파일을 만드는데, 교육으로 한 파일에서 생성함

class Account {
    // 입금(입금할 금액, 계좌잔액)
    // 아래의 값은 실행 후 사라지는데(stack이므로) 값을 유지시키기 위해서 return을 한다.
    int deposit(int amount, int money) {
        int restMoney = money + amount;
        return restMoney; // return : 메서드를 호출한 라인으로 복귀하는 쪽으로 값을 반환 - 반환하려면 원래 void자리에 반환하는 값의 타입을 적는다.
                          // void자리 type = 값 type
        // return restMoney = 1.1이라면 강제적인 형변환 해야함 - (int)1.1 또는 void 자리에 double하기
    }

    // 출금(출금할 금액 300, 계좌잔액 - money)
    int withdraw(int amount, int money) {
        int restMoney1 = money - amount;
        return restMoney1;
    }

    // 이체(보낼 금액(amount), 받는 사람의 잔액(receiverMoney), 보내는 사람의 잔액(senderMoney)) - 출력만
    // 해보기
    void transfer(int amount, int receiverMoney, int senderMoney) {
        int receiverRestMoney = receiverMoney + amount;
        int senderRestMoney = senderMoney - amount;
    }
}

public class Meth03 {
    public static void main(String[] args) {
        // class Account를 소환해 int deposit 공식을 빌려 쓰지만,
        // account1이 들어가 있는 heap타입은 Account(class Meth03에서 만들었기 때문에)
        // new하면 static이 아닌 모든 이름만 뜬다. - 현재 heap에 deposit, withdraw, account1 / stack에
        // 없음
        // new를 account1이 실행되면! deposit의 (){}가 다 stack에 뜸
        // new를 하면 heap에 new 갯수 만큼 공간이 뜬다(+ 호출한 다른 class의 heap 저장 개수)

        int hMoney = 1000;
        // 'money'라는 변수를 만들어 줘야 출력시 호출할 변수 이름이 필요하기 때문에
        // 홍길동의 잔액

        int iMoney = 1000;
        // 임꺽정의 잔액

        // 홍길동이 입금을 2번 하고, 출금 1번 하기
        Account hAccount = new Account();
        hMoney = hAccount.deposit(100, hMoney);
        // 위의 호출코드는 사라지고 'money = 1100'의 데이터만 heap에 남는다.
        // 만약 money를 class Meth03에 초기값을 설정하지 않았다면,
        // 위의 코드는 account1.deposit(100,1000); 이고 '1100'만 heap에 남는다.
        System.out.println("홍길동의 남은 금액 : " + hMoney);
        // 그렇다면 출력시 "남은 금액 : " + ??????? '1100'을 호출할 변수 이름이 없다.
        hMoney = hAccount.deposit(500, hMoney);
        // 위의 호출 코드는 사라지고 money = 1500'의 데이터만 heap에 남는다.
        System.out.println("홍길동의 남은 금액 : " + hMoney);
        hMoney = hAccount.withdraw(300, hMoney);
        System.out.println("홍길동의 남은 금액 : " + hMoney);

        // 1300인 이유는 위의 코드에서 잔액이 1600이었기 때문에
        // 결과값이 계속 쌓인다

        // 임꺽정이 입금을 1(100)번 하고, 출금 2(300, 500)번 하기
        Account iAccount = new Account();
        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("임꺽정의 남은 금액 : " + iMoney);
        iMoney = iAccount.withdraw(200, iMoney);
        System.out.println("임꺽정의 남은 금액 : " + iMoney);
        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("임꺽정의 남은 금액 : " + iMoney);

        // iMoney = iAccount.transfer(300, iMoney, hMoney);

    }
}
