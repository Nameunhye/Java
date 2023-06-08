package ex06.ch03;
// 다형성

class 지구인 {
}

class 아시아인 extends 지구인 {
    void speak() {
        System.out.println("아시아어");
    }
}

// 부모가 가지고 있는 메소드와 동일한 이름의 메소드를 자식이 들고 있다면(=재정의) 부모의 메소드가 오버라이드가 된다. - 변수제외
// 중복된 이름의 메소드를 가진 class 위로 호출하면 맨 위에 있는 중복된 메소드(부모의 메소드)가 오버라이드 된다. = 동적 바인딩
// 예. 지구인 d1 = new 한국인에서 d1.speak를 호출하면, 재정의가 된 "한국어"의 speak가 호출된다.
// 예. 지구인 d1 = new 아시아인에서 d1.speak를 호출하면, "아시아어"의 speak가 호출된다.
// 오버라이드 : 무효화하다

class 한국인 extends 아시아인 {

    String name = "지구인";
}

class 홍길동 extends 한국인 {
    void speak() {
        System.out.println("한국어");
    }
}
// heap에 쌓이는 구조는 자식 -> 부모 ; 홍길동 -> 한국인 -> 아시아인 -> 지구인 순
// access한 곳부터 데이터를 찾을 때 까지 위로 full-scan을 한다. (이것을 부모를 물려받는다고 표현 - 부모 데이터와 구조 등을
// 자식도 찾을 수 있다.)
// 만약, 아시아인 p1 = new 한국인(); String name을 찾지 못한다. 아래로 scan이 안됨

// java는 다형성을 성립하면 같은 type으로 묶어준다.

public class Exten01 {
    public static void main(String[] args) {
        아시아인 d1 = new 홍길동();
        d1.speak();
        // 홍길동의 부모포함 총 4개(지구인, 아시아인, 한국인, 홍길동)의 type이 heap에 뜬다

        // new를 통해 heap에 type별 heap을 띄울 수 있다.
        // type은 메모리 공간의 위치를 말한다.
        // 지구인 d1 = new 홍길동();
        // 지구인 heap을 가리킨다.
        // 원래는 홍길동 d1 = new 홍길동(); 이렇게 type이 같아야 하는데
        // 부모인 지구인, 아시아인, 한국인 d1 = new 홍길동();이 가능하다.
        // 근데 반대로 (한국인 d1 = new 아시아인)은 되지 않는다.

        // 아직 실행되지 않았기 때문에 안에는 데이터가 비워있다.

    }
}
