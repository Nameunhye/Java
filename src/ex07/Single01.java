package ex07;

// 싱글톤 - 구조를 보고 싱글톤이라는 것을 파악하기만 하면 됨

class 미니언 {
    public 미니언() {
        System.out.println("미니언이 생성 되었습니다.");
    }
}

// 단 하나만 유지하고 싶음 - 제한
class 바론 {
    public static 바론 instance = new 바론();
    // 1. main이 뜨기 전에 static에 new로 먼저 띄어 놓은 상태를 유지하다가

    public static 바론 getInstance() {
        return instance;
    }
    // 3. 그때 static에 띄어놓았던 바론이 heap에 저장된다.

    private 바론() {
    }

}

public class Single01 {
    public static void main(String[] args) {
        미니언 m1 = new 미니언();
        미니언 m2 = new 미니언();
        미니언 m3 = new 미니언();

        바론 b1 = 바론.getInstance();
        바론 b2 = 바론.getInstance();
        // 2. main에서 호출하면

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        // 동일한 해시코드라는 것은 동일한 heap에 저장되어 있다는 것
        // hashCode는 heap에 저장된 주소

        // b1과 바론이 같은 타입인가 검증
        if (b1 instanceof 바론) {
            System.out.println("같은 타입입니다.");

        }
        if (b1 instanceof Object) {
            System.out.println("바론과 오브젝트는 같은 타입입니다.");
        }
        // Object는 모든 클래스를 extends를 하고 있다(암묵적으로) - new할수 있는 모든 오브젝트의 부모
        String str = "hi";
        Object obj = str;
        // 가능한 이유는 묵시적 형변환(string보다 object가 더 크기 때문에)
    }
}
