package ex07;

// 추상화 문법 복습
/**
 * 1. 추상 클래스는 new를 할 수 없다.
 * 2. 추상 클래스는 일반 메소드와 추상 메소드를 가질 수 있다.
 * 3. 추상 클래스는 상태 변수를 가질 수 있다.
 * 
 * -
 */

abstract class 동물 {

    String name;

    public void run() {
        System.out.println("달린다");
    }

    public abstract void speak();
    // 구체적인 행위를 모를 때 추상화 -> 구체적인 행위는 자식이 해라
}

class 사자 extends 동물 {

    @Override
    public void speak() {
        System.out.println("어흥");
    }

}

public class Abstract01 {
    public static void main(String[] args) {

    }
    // new 동물(); X -> 1번 이유
}
