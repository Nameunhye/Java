package ex06.composit;
// 상속을 하는 이유

// 다형성 - 타입을 일치(추상화) ; 주 목적!
//         : 부모를 바라보고 메소드를 시키면 부모가 실행되는데, 결국 자식들도 오버라이딩이 되어서 부모가 실행되면 자식들도 실행이 된다. - 일의 편리성 
// 실제로 재산을 물려받기 ; 부 목적

public class BigBurger extends Burger {
    // 생성자
    public BigBurger() {
        super(1500, "빅버거");
        System.out.println("빅버거가 만들어졌습니다.");
    }

    public BigBurger(int price) {
        super(price, "빅버거");
        System.out.println("빅버거가 만들어졌습니다.");
    }

    // 생성자 오버로딩
    public BigBurger(int price, String desc) {
        super(price, desc);
        // this (x), super가 상태를 가지고 있기 때문에
        System.out.println("빅버거가 만들어졌습니다.");
    }
}