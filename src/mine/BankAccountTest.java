package mine;

class BankAccount {
    private String owner;
    private String accountNumber;
    private int balance;

    public void deposit(int plusMoney) {
        balance += plusMoney; // balance = balance + money ; 이렇게 하면 또 balance를 변수로 하나 더 추가해줘야 하니꺄..
    }

    public void withdraw(int minusMoney) {
        balance -= minusMoney;
    }

    public void number(String n) {
        accountNumber = n;
    }

    public void user(String u) {
        owner = u;
    }

    @Override
    public String toString() {
        return owner + "님의 계좌번호는 " + accountNumber + "이며, 현재 잔액은 " + balance + "입니다.";
    }

}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.deposit(50000);
        bank.deposit(1500);
        bank.deposit(1500);
        bank.withdraw(1000);
        bank.number("123-456-1885");
        bank.user("나므네");
        System.out.println(bank);
    }
}
