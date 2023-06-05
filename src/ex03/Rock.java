package ex03;

public class Rock {

    public static void main(String[] args) {
        double n1 = (int) (Math.random() * 3);
        // Math.random은 0이상 1미만의 임의의 실수를 내고, 앞에 int를 붙여서 실수값이 뺀 정수값만 나오게 한다.
        System.out.println(n1);
        // math : 수학, ()형태는 모두 메서드.

        // import를 안해도 되는 라이브러리 : 자주 써서 내부 라이브러리에 있기 때문에
        // 오류가 나면 alt + shift + o
    }

}
