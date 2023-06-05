package ex05;

// 메서드, static, heap, stack에 저장되는 파일

class Cal02 {

    void add(int n1, int n2) { // int n1, int n2 - '매개변수'/ ,는 2개라서
        int sum = n1 + n2;
        // int n1, int n2 : stack에 저장 (로컬변수 = 지역변수)
        // add stack에 n1=10, n2=5로 총 8byte 저장 - c1
        System.out.println("더하기 : " + sum); // 스택을 종료하고 복귀 주소를 확인하고 복귀한다.
    }

    void minus(int n1, int n2) {
        System.out.println("빼기 : " + (n1 - n2));
    }

    void multi(int n1, int n2) {
        System.out.println("곱하기 : " + (n1 * n2));
    }

    void divide(int n1, int n2) {
        System.out.println("나누기 : " + (n1 / n2));
    }
}

public class Meth02 {
    public static void main(String[] args) {
        Cal02 c1 = new Cal02(); // heap에 Cal02 공간을 c1이라고 한다(add 이름만 뜨고 ()는 뜨지 않는다)
        c1.add(10, 5); // arguments = '인수'를 넣어야 한다(매개변수의 값)
        // add stack에 n1=10, n2=5로 총 8byte 저장
        // c1 + .(연결연산자) + add + 매개연산자 - 기존 메서드 add body부분으로 가서 실행 후 종료가 되면 현재 제자리로 복귀할
        // 때 stack 값은 은 메모리에서 지워진다.
        // 그 다음 바로 밑의 minus가 실행
        // 메서드 호출 = 메모리 적으로 호출
        c1.minus(5, 1);
        c1.multi(3, 2);
        c1.divide(8, 4);

    }
    // 사용할 때 호출해서 부름(new) / heap에 저장됨
}
