package ex06.ch02;

public class Dragoon extends ProtossUnit {
    String name;
    int hp;
    int attack;

    public Dragoon(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public int attack() {
        return attack;
    }

    @Override
    public int hp() {
        return hp;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

}
