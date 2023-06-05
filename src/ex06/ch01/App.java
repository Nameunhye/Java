package ex06.ch01;

// 오버로딩 : 하나의 메소드에 여러가지 기능을 넣는 것
// App 파일은 메인 파일
public class App {

    static void attack(Zealot u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    static void attack(Zealot u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    static void attack(Zealot u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    static void attack(Dragoon u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    static void attack(Dragoon u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    static void attack(Dragoon u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    static void attack(DarkTempler u1, DarkTempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    static void attack(DarkTempler u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    static void attack(DarkTempler u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격 당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1", 100, 10);
        Zealot z2 = new Zealot("질럿2", 100, 10);
        Dragoon d1 = new Dragoon("드라군1", 100, 5);
        Dragoon d2 = new Dragoon("드라군2", 100, 5);
        DarkTempler dt1 = new DarkTempler("다크템1", 100, 15);
        DarkTempler dt2 = new DarkTempler("다크템2", 100, 15);

        // 질럿 -> 드라군 공격
        attack(z1, d1);

        // 드라군 -> 질럿 공격
        attack(d1, z2);

        // 질럿1 -> 질럿2 공격
        attack(z1, z2);

        // 드라군1 -> 드라군2 공격
        attack(d1, d2);

        // 다크템1 -> 드라군2 공격
        attack(dt1, d2);

        // 오버로딩 체험하기
        System.out.println();
        System.out.println(1);
        System.out.println(1.1);
        System.out.println('가');
        System.out.println("문자열");
        System.out.println(true);

    }
}
// 미리 필요한 메소드를 만들어 놓고, 필요할 때 마다 호출한다.
