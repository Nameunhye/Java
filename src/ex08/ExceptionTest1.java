package ex08;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("기안84");
            System.out.println(num);

        } catch (Exception e) {
            System.out.println("NumberFormat 예외 발생");
        }
        System.out.println("프로그램이 진행되었습니다.");
    }

}
