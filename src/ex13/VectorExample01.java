package ex13;

import java.util.*;

class Monster {
    String name;
    double hp;

    public Monster(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Monster [{" + name + ", " + hp + "}]";
    }

}

public class VectorExample01 {
    public static void main(String[] args) {

        Vector<Monster> list = new Vector<>();
        // Monster class의 정보를 Vecter에 저장

        list.add(new Monster("Mon1", 100.0));
        list.add(new Monster("Mon2", 200.0));
        list.add(new Monster("Mon3", 300.0));
        // new를 통해 Monset에 매개변수 값을 넣은 정보를 Vector에 저장하기

        System.out.println("벡터의 크기 : " + list.size());
        System.out.println(list);

    }
}
/*
 * 
 * Vector<>의 < > 안에는 다양한 타입을 넣을 수 있습니다. 기본적으로 Java의 제네릭(Generic)은 참조
 * 타입(Reference Type)에 적용되며, 기본 자료형(Primitive Type)은 직접 사용할 수 없습니다.
 * 
 * 다음은 Vector<>의 < > 안에 넣을 수 있는 예시입니다:
 * 
 * 참조 타입: 클래스, 인터페이스, 추상 클래스 등의 참조 타입을 사용할 수 있습니다.
 * 
 * 예시: Vector<String>, Vector<Integer>, Vector<MyClass>, Vector<List<String>> 등
 * 사용자 정의 타입: 직접 정의한 클래스나 인터페이스를 사용할 수 있습니다.
 * 
 * 예시: Vector<Person>, Vector<Customer>, Vector<Order>, Vector<Employee> 등
 * 제네릭 타입: 다른 제네릭 타입을 타입 인자로 사용할 수 있습니다.
 * 
 * 예시: Vector<List<String>>, Vector<Map<String, Integer>>, Vector<Set<Integer>>
 * 등
 * 주의할 점은 기본 자료형을 사용하기 위해서는 해당 기본 자료형의 래퍼 클래스(Wrapper Class)를 사용해야 합니다. 예를 들어,
 * 정수를 저장하려면 Vector<Integer>를 사용해야 합니다.
 * 
 * 따라서 Vector<>의 < > 안에는 대부분의 참조 타입을 사용할 수 있습니다.
 */
