package ex05;

// 상태 없이 행위만 만들예정(모든 것을 객체지향 할 필요 X) 호출
// void add(){} - 메서드의 기본형태
class Cal01 {
    void add() {
        System.out.println("add 호출됨");
    }

    void minus() {
        System.out.println("minus 호출됨");
    }

    void multi() {
        System.out.println("multi 호출됨");
    }

    void divide() {
        System.out.println("divide 호출됨");
    }
}

// 코드를 radd, minus, multi, divide 안에 모듈화 시켜놓음 = 캡슐화
public class Meth01 {
    public static void main(String[] args) {
        Cal01 c1 = new Cal01(); // heap에 뜸
        c1.add(); // 호출
        c1.minus();
        c1.multi();
        c1.divide();

        Cal01 c2 = new Cal01(); // 같은 캡슐을 함께 또 불러도 됨
        c2.add();
        c2.minus();
        c2.multi();
        c2.divide();
    }
    // 사용할 때 호출해서 부름(new) / heap에 저장됨
}
