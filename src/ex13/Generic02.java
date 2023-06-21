package ex13;

// 싱글톤타입(미리 완성된 타입)

class 윤석열 {
    // 2.
    // 제네릭 프로그래밍은 어떤 타입이 적용될 지 모를 때, 종합적인 제네릭을 적용하는데
    // 이미 싱글톤 타입으로 main에 호출 1번 했고, 또 new를 하지 못하기 때문에, <T>/ T 를 할 수 없다.
    // 그래서 제네릭을 사용하지 못할 때, 무슨 타입을 쓸 지 모를 때
    // 무조건 Object

    private Object data;
    private static 윤석열 instance = new 윤석열();

    public static 윤석열 getInstance() {
        return instance;
    }

    private 윤석열() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

public class Generic02 {
    public static void main(String[] args) {
        // 1.
        // 싱글톤 타입으로 new 할 수 없다.
        // 딱 한번 메모리에 뜬다.
        윤석열 d1 = 윤석열.getInstance();
        d1.setData(1);

        int value = (int) d1.getData();
        // object 타입으로 다운캐스팅을 해야 한다 -> 미리 만들어 놓은 객체이므로 땡겨쓰는 거다 라고 생각하기
        System.out.println(value);

    }
}
