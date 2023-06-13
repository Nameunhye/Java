package ex06.composit;

// composit, this, super, 다형성, 재산을 물려 받는 것 - 기본 문법
public class Burger {
    private int price;
    private String desc;
    // private - 직접 건들이지 못하게, 상태는 행위를 통해 변경되어야지 행위를 위해 상태를 변경하지 못하도록 하기 위해서

    public Burger() {
        this(1000, "버거");
        // 이름은 그대로고 가격만 계속 바뀌는 거 귀찮다.

    }
    // heap에 뜨려면 new Burger를 호출해서, 그 heap에 뜬 Burger에 this 값이 들어가고 그 값은 아래의 Burger에
    // 들어간다. 그래서 private price에 들어간다.

    public Burger(int price) {
        this(1000, "버거");
        // 그래서어어어어..
        // "버거"는 이미 적혀있으니까, price만 매개변수로 주면 된다.

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 생성자가 필요, 일일이 값을 넣어주기 보다는 초기화 시키는 편이 좋다. - setter
    public Burger(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("버거가 만들어 졌습니다.");
    }

    // getter
    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }
    // 상속을 해서 버거를 만드는 편이 좋다. - '버거'라는 다형성을 충족시킬 수 있기 때문에
}
