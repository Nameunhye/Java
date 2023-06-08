package ex06.ch03;

// dog와 cat의 공통 추상화 명칭 만들기(부모/다형성을 성립)
abstract class Animal { // 추상클래스
    abstract void speak(); // 추상메소드, 추상적으로 만들어서 body가 없음
} // 추상메소드는 추상클래스에서만 사용할 수 있다.
  // 추상메소드는 실체가 없는 메소드이기 때문에, 인수값을 넣을 수가 없다.

class Bird extends Animal {

    @Override
    void speak() {
        System.out.println("짹짹");

    }

}

class Dog extends Animal {

    void speak() {
        System.out.println("멍멍");
    }
} // 이와 같이 추상클래스를 extends를 하면 행동을 구현해줘야 한다.

class Cat extends Animal {

    void speak() {
        System.out.println("야옹");
    }
}

public class Exten03 {

    static void start(Animal u) {
        u.speak();
    }

    public static void main(String[] args) {
        Animal d = new Dog();
        d.speak();

        Animal c = new Cat();
        c.speak();

        Animal b = new Bird();
        b.speak();

    }
}
