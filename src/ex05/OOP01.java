package ex05;

class Player {
    String name;
    int thirty; // 0~100 (클수록 목마름) - 범주를 만들어 놓음
    // ---- 상태

    public Player(String name, int thirty) {
        this.name = name;
        this.thirty = thirty;

        // 생성자는 return이 없다.
        // 그래서 main에서 입력한 name 값은 생성자로 받고, 거기서 처음 name으로 올라가 상태값을 초기화시킨다.
        // 그 후 heap에 저장이 된다.
        // 생성자는 스캐너랑 다르다.

    }

}

public class OOP01 {
    public static void main(String[] args) {
        Player p1 = new Player("홍길동", 100);
        Player p2 = new Player("임꺽정", 100);
        // 현재 이 상태 : 변수를 소환했는데 값이 없는 상태 - null(초기화된 값이 없는 상태) > 생성자 필요
        System.out.println(p1.name + p1.thirty);
    }
}
