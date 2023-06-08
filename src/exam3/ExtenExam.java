package exam3;

class 육식동물 {
    public void print() {
    }
}

class Tiger extends 육식동물 {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

class Lion extends 육식동물 {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

public class ExtenExam {

    static void start(육식동물 a) {
        a.print();
    }

    public static void main(String[] args) {
        Lion lion = new Lion("사자 1");
        Tiger tiger = new Tiger("호랑이1");

        start(lion);
        start(tiger);

    }
}

// start lion / tiger 출력 가능하게
// 오버라이딩으로

// 1. 먼저, start lion / tiger을 호출하기 위해 start의 실행 메소드를 만들어야 한다.
// 2. 자식 메소드를 보면 "print"메소드의 출력이 나오는 것이기 때문에 start의 실행 메소드는 "print", 그리고 동물들의
// "print"값을 호출해야 하기 때문에 앞에 호출연산자 (.)을 이용한다.
// 3. 그런데 동물들을 일일히 호출하기 보다는 똑같은 구조의 print를 가지고 있는 부모클래스를 만들어 코드 수를 줄이고, 그 부모클래스
// 메소드를 오버라이딩해서 값이 호출되도록 해보면 된다.
// 4. 그래서 부모 클래스인 "육식동물"에 자식클래스들이 가지고 있는 "print" 메소드를 만들고, 자식클래스는 부모클래스의
// "print"를 재정의하기 위해 extends를 한다.
// 5. start으로 돌아와서, 매개변수는 부모클래스인 "육식동물"을 부르고 변수선언을 한다.
// 6. 변수.print();로 start의 메소드 실행코드를 만든 뒤
// 7. start(main in 동물 이름);을 호출하면 각 동물의 print값이 호출된다.