package ex06.ch04;

// super 생성자를 통해 부모한테 값을 주는 것
// 구체적인 클래스의 구체적인 상태가 모두 동일하다면(똑같은 구조) 부모 클래스에 끌어 올릴 수 있다 -> 그리고 각 자식에서는 지워도 된다.

public abstract class ProtossUnit {
    String name;
    int hp;
    int attack;

    public ProtossUnit(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
}