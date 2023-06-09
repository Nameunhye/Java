package ex06.ch04;

import ex06.ch02.Dragoon;

// super 생성자를 통해 부모한테 값을 주는 것

public class App {

    static void attack(ProtossUnit u1, ProtossUnit u2) {

    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit d1 = new ex06.ch04.Dragoon("드라곤1", 100, 5);
    }

}
