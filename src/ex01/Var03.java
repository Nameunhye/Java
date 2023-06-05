package ex01;

public class Var03 {
    public static void main(String[] args) {
        // 업 캐스팅(묵시적 형변환)
        int n1 = 10;
        double d1 = n1; //'변수의 선언'(값이 없음)
        // double d1 = n1; 가능, 왜냐하면 double(8byte)이 int(4byte)보다 저장크기가 더 크기 때문에
        System.out.println(d1);

        // 다운 캐스팅(명시적 형변환)
        double d2 = 10.5;
        int n2 = (int)d2;
        // 원래 되지 않으나, 문법으로 정리. 작은 곳에 넣고 싶다면 파일을 반 쪼개고 넣는다. 그 대신 파일은 온전하지 못한다.
        // 위에 (int)를 넣으면 데이터의 저장크기가 반으로 쪼개지고. 소수 점은 사라진다.
        System.out.println(n2);  

        // 문자 형변환(아스키코드) - 예외
        byte ch = 65;
        char data = (char)ch;
    
    
        // 통신으로는 2진수로 들어오는데, 컴퓨터가 10진수로 파싱을 한다. 
        // 0101010111 -> 65 -> A
        // byte = 65로 통신을 받았을 때, A로 내고 싶으면 char를 이용하면 되는데
        // byte는 1, char는 2의 저장크기로 다운 캐스팅을 할 필요없지만
        // 예외적으로 이 경우에만 적용한다.
        System.out.println(data);

        char a2 = 65;
        System.out.println(a2);


    }
}
