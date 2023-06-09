package ex06.ch05;

/**
 * 인터페이스 + -Able
 * 1. 필요한 메소드만 노출 시키고 싶을 때!!
 * 2. 프로그램 설계할 때, 특정 메소드만 사용하도록 강제시키고 싶을 때!
 * 인터페이스도 추상메소드를 가질 수 있다.
 * 
 * 2번 내용 인터페이스는 노출시킬 것을 먼저 만들고 이후 세부 메소드를 만든다.
 */
// 1. 필요한 메소드들을 만든 후 -> 노출 시킬 것만

// 엄청 많은 메소드 사이에서 외부에 보여줄 표를 만든다. = 부모로 만든다. / 보여주는 것은 내가 만들었으니 내가 결정
// 개발자와 사용자의 매개체
// 쉬운 ux는 인터페이스에 가볍게 적는다.
// 인터페이스는 new를 하지 못한다. 그래서
// "CarAble의 구현체는 Car이다."
// 그러면 'class Car implements CarAble'라는 걸 인지를 할 수 있다.
// 위의 문구(어떤 것이 구현체인지)가 없다면, API문서를 작성해놔야 한다. 아니면 이 인터페이스의 구현체가 어떤건지 모른다.
interface CarAble {
    public abstract void 엑셀();
}

// 아래의 실행 메소드를 호출로 정리한다.
// 복잡한 메소드는 아래에 다 적는다.
// implements CarAble (X) - interface는 추상클래스이므로 추상 클래스를 행위를 구현해야 한다. 그래서 오버라이딩이
// 필수다.
// implements는 행위를 제어(다형성이랑 상관이 없다.)
class Car implements CarAble {

    @Override
    public void 엑셀() {
        엔진가열();
        모터작동();
        바퀴회전();

    }

    private void 엔진가열() {
        System.out.println("엔진가열");
    }

    private void 모터작동() {
        System.out.println("모터작동");
    }

    private void 바퀴회전() {
        System.out.println("바퀴회전");
    }
}

public class InterEx01 {
    public static void main(String[] args) {
        CarAble carAble = new Car();
        // 다형성이랑 상관이 없기 때문에 new의 제한이 없다.
        //
        carAble.엑셀();

    }
}
// 2. 1번의 것을 추후에 쓸 때 이미 설계된 것만 사용할 수 있도록 강제성을 부여
// 2. 애초에 인터페이스 설계만 먼저하고, 자동차를 만드는 경우(먼저 특정 메소드만 사용할 수 있도록 제한사항을 먼저 작성해놓음.)