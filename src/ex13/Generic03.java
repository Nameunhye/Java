package ex13;

class Data<T> {
    int status; // 정수 200
    T body; // 값
}

public class Generic03 {

    // 제네릭
    // check에 정수가 들어오면, String 타입의 Data를 return
    // return 타입을 Data<String>으로 고정시켜놓았기 때문에 다른 타입으로 return이 안된다.
    // 그런데
    // 와일드 카드
    // <?>여러가지 타입을 return할 수 있다.
    // 오브젝트 타입을 return하고 싶으면 <?>를 사용하는 것이 문법
    Data<?> getNum(int check) {

        if (check == 1) {
            Data<String> data = new Data<>();
            return data;
        } else {
            Data<String> data = new Data<>();
            return data;

        }
    }

    // Object
    // 미리 만들어진 라이브러리
    Object getNum2(int check) {
        if (check == 1) {
            return "안녕";
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Generic03 g3 = new Generic03();
        int n = (int) g3.getNum2(1);
    }
}
