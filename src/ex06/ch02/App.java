package ex06.ch02;

public class App {
    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // u1.hp = u2.hp - u1.attack;
        // System.out.println(u2.name + "이 공격 당했습니다");
        // System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit z2 = new Zealot("질럿2", 100, 10);
        ProtossUnit d1 = new Dragoon("드라군1", 100, 5);
        ProtossUnit d2 = new Dragoon("드라군2", 100, 5);
        ProtossUnit dt1 = new DarkTempler("다크템1", 100, 15);
        ProtossUnit dt2 = new DarkTempler("다크템2", 100, 15);

    }
}

// 1. 다형성 실습
// 2. 변수, 메소드가 어떻게 찾는지
// 3. 오버라이드 동적변화가 뭔지
