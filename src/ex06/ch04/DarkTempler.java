package ex06.ch04;

// 
public class DarkTempler extends ProtossUnit {
    public DarkTempler(String name, int hp, int attack) {
        // new Zealot을 하면 이것이 뜬다. 현재 추상클래스(내용은 protoss가 가지고 있기 때문에)

        super(name, hp, attack);
    }
}