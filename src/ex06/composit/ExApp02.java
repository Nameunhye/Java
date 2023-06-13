package ex06.composit;

//composit
public class ExApp02 {
    public static void main(String[] args) {
        Coke c1 = new Coke();
        // 콜라 주세요.
        Coke c2 = new Coke(400, "콜라");
        // 20% 할인 쿠폰들고 왔는데, 콜라주세요.
        // 우리가 직접 계산해서 입력

        // 버거 세트 주세요.
        Burger b1 = new Burger();
        Coke c3 = new Coke();
        Potato p1 = new Potato();

        // BurgerSet bs = new BurgerSet(b1, c3, p1);
        // 버거 세트 할 때 마다 new 세 개를 해서 호출하기 귀찮을 때 ↓
        // 바로 튀어날 수 있도록.

        BurgerSet bs2 = new BurgerSet();
    }

}
