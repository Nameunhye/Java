package ex07;

// 인터페이스
/**
 * 1. 인터페이스는 new할 수 없다.
 * 2. 인터페이스는 static 변수를 만들 수 있다.
 * 3. 인터페이스는 추상메서드만 가진다.
 */
interface Remote {
    int NUM = 10; // public static final(생략) - final변수는 전부 대문자로 작성

    void run(); // public abstrack (생략)
}

public class Inter01 {
    public static void main(String[] args) {
        System.out.println(Remote.NUM);
    }
}
