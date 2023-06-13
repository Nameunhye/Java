package ex06.composit;

public class ExApp01 {
    public static void main(String[] args) {
        Burger b1 = new Burger();
        // 이미 생성자에 고정시켜놓은 가격이 알아서 적용된다.
        System.out.println("===============================");
        Burger b2 = new Burger(800, "버거");
        // 이름은 그대로고 가격만 계속 바뀌는 거 귀찮다.
        System.out.println("===============================");
        Burger b3 = new Burger(500);
        System.out.println("===============================");
        BigBurger bb1 = new BigBurger();
        System.out.println("===============================");
        // 자식을 호출하면 부모도 호출된다.
        BigBurger bb2 = new BigBurger(1300, "빅버거");
        System.out.println("===============================");
        BigBurger bb3 = new BigBurger(800);
    }
    // main 스레드가 실행되어 종료되었다 ; 메일의 실행과 끝
}
