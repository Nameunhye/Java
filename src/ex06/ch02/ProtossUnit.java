package ex06.ch02;

public abstract class ProtossUnit {

    public abstract String name();

    public abstract int hp();

    public abstract void setHp(int hp);

    public abstract int attack();

    // 실제로 부모클래스를 작성한다기 보다 이렇게 만들어진 코드를 보고 호출이 되면 오버라이딩한거라는 것만 인식하면 된다.
    // 똑같이 다른 버전 ↓
    // (public) void setHP(int hp){}
    // (public) int hp();
}
