package ex06.composit;

//composit - 결합 : 버거, 콜라, 감자(내가 상태로 들고 있으면 됨)
public class BurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BurgerSet() {
        this(new Burger(), new Coke(), new Potato());
    }
    // 생성자를 통해서 초기화해야한다.
    // 매개 변수 new를 줘서 실행될 때 마다 new가 되도록!
    // 위에 int나 String 등의 타입이 아닌, Burger Coke Potato 타입이라 new로 대체

    /////////////////////////////////////////////////////////////////////
    // 외부에서 new해서 이리로 전달해 온다.
    // 외부 : 각 클래스의 생성자로 주입받는다.
    // new하지 않는 이유는 고정값을 지정해놓으면 가격 수정을 이중으로 해야 하기 때문에
    private BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
    }
    // new로 접근한다는 것은 heap의 주소를 만들어 주는 것.

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

}
