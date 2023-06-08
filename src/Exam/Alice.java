package exam;

class 엘리스 {
    static String name = "엘리스";
    int height = 160;

    void eat(int qty) {
        this.height = this.height + (10 * qty);
    }
}

public class Alice {
    public static void main(String[] args) {
        엘리스 e = new 엘리스();
        e.eat(5);
        System.out.println(e.height);
    }
}
// jvm 실행시
// 1) 클래스 로드 - static 키워드 찾기
// 2) static 로드 - 엘리스 static(name = "엘리스") / Alice static(main) 메모리를 읽는다
// 3) main 실행(public / static에 떠야 가능 / 메소드 명이 main) -> 조건
// 4) main의 stack과 q가 생긴다
// 5) main의 q - 16/17번 생성
// 6) 16번 우변 실행 시 heap생성 - heap의 아무 공간이나 엘리스(class명) 타입으로 height = 160 / eat 이
// 저장된다. (heap은 타입별로 저장 - class명이라고 생각하면 될 듯 하다)
// 7) 16번 좌변 실행 시 main stack - '엘리스 e'가 만들어지면서 위의 heap[height = 160 / eat]의 주소를
// 저장한다. (값이 아닌 heap 저장위치 주소만) 그리고 *표시를 한다.(값이 있는 곳에 포인트 해놓는것 : 포인터)
// stack의 공간 용량은 알 수 없기 때문에 값을 저장하지 않고, 정확한 데이터의 용량만 저장한다.
// new의 저장공간은 4byte, 주소만 저장함으로써 stack에는 4byte만 저장하고 그 주소로 heap에 저장된 값을 사용한다.
// 일정하지 않은 데이터는 heap에 저장한다.
// new는 참조변수, 레퍼런스 변수라고 한다.
// 8) 17번 실행(pop)을 한다.
// 9) eat의 stack과 q가 생긴다.
// 10) eat q - 10/11번 생성
// 11) 10번 실행시 eat stack에 'int qty = 5' 생성
// 12) 11번 실행시 같은 엘리스 heap에 'height=160'과 'eat이 저장되어 있으니 eat stack이 실행될 때,
// height의 값을 heap에서 찾으면 되고 그리고 this.height이기 때문에 heap에 저장된다
// (10*5))' 다른 메모리 공간에서 찾을 필요 없고 같은 실행이 되어 heap에 저장된다.

// static 메모리는 공유메모리라고도 한다. new로 호출할 필요 없어 static은 한번만 뜨면 어디서든 사용이 가능하기 때문에 예)
// class명.name
// 메소드 실행 전 main stack에서 static 메모리는 이미 존재해있었기 때문에 있지만, 그 안의 변수(함수)는 실행이 되어야
// 존재해진다.

// main이 실행 = q에 자기가 가지고 있는 모든 소스가 push
// pop = 소스를 꺼내서 실행하는 것(cpu가)

// stack은 다른 stack에 접근이 불가능
// 같은 class 내 heap은 stack이 접근 가능
// stack이 다른 곳에서 값을 불러오고 싶으면 return이나 자기 class에서 그 값을 heap에 저장해야함
