package ex08;

public class ArrayError {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 }; // 배열의 크기(5)
        int i = 0;

        try {
            for (i = 0; i <= array.length; i++) {
                System.out.println(array[i] + " ");
            }
            // array[i]는 i가 0 ~ 5까지 총 0, 1, 2, 3, 4, 5 6개의 배열은 출력한다.
        } catch (Exception e) {
            System.out.println("인덱스 " + i + "는 사용할 수 없네요!");
            // 하지만 array[]의 크기는 5, 배열의 갯수는 6이므로
            // 0, 1, 2, 3, 4 만 array[i] 안에 저장이 가능하다.
        }
    }
}
