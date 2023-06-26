package ex13;

import java.util.Vector; // vector 메소드 사용

public class VectorTest01 {
    public static void main(String[] args) {

        Vector vc = new Vector();

        /*
         * 내부 배열 : Vector가 요소를 저장하는데 사용하는 자료구조
         * Vector( )의 ( )는 초기 용량을 지정할 수 있도록 하는 것이다.(비어도 OK)
         * 초기 용량을 지정하여 해당 크기의 [빈 Vector 객체]를 생성한다.
         * 
         * 내부 배열은 동적으로 크기 조정 O, 추가/제거시 자동 조정 O
         * 초기 용량을 설정한다면 추가/제거에 내부배열의 크기조정이 자주 발생되지 않아서 성능면으로 유리할 수 있다.
         * 
         * 초기 용량을 설정하더라도 실제로는 더 많은 요소를 저장할 수 있으며, 필요에 따라 내부 배열의 크기가 자동으로 조절된다.
         */

        vc.add("Hello World!"); // 문자열
        vc.add(new Integer(10)); // 정수개념의 10
        vc.add(20); // 20

        System.out.println("vector의 size" + vc.size());
        // 벡터의 size는 벡터에 저장된 요소의 개수에 따라 달라진다.
        // 벡터의 size를 확인하는 방법은 위와 같다.

        for (int i = 0; i < vc.size(); i++) {
            System.out.println("vectoer element" + i + ": " + vc.get(i));
        }
        // 벡터 값을 추출 시 get()을 적용한다.

        String s = (String) vc.get(0);

        /*
         *다운캐스팅
         * i의 첫 번째 요소를 가져와서 Objcet -> String 타입으로 형변환 하는 것.
         * i의 첫 번째 요소는 어떤 타입인 지 모르는 상황이다.(Object 타입)
         * 
         * 다운캐스팅을 하는 이유는, 특정 인덱스 요소를 원하는 타입으로 사용하기 위해서이다.
         * vc[0]에는 문자열 "Hello World!"가 저장되어있고, 저 문자열을 String으로 변환시켜
         * 사용하려고 한다.
         * 
         * 만약, 벡터에 저장된 첫번째 요소가 실제로 String타입(문자열)이 아니라 다른 타입(예, 숫자, 단어 등)이라면
         * 런타임 시 "ClassCastException"이 발생할 수 있다.
         * 
         */

        
    }

}
